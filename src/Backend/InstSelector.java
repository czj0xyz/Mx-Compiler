package Backend;

import ASM.ASMBlock;
import ASM.ASMFunc;
import ASM.ASMInst.*;
import ASM.ASMModule;
import ASM.Operand.*;
import IR.*;
import IR.IRInst.*;
import IR.IRType.*;
import IR.IRValue.IRBasicValue;
import IR.IRValue.IRConst.*;
import IR.IRValue.IRGlobalVar;
import IR.IRValue.IRReg;

import java.util.ArrayList;

public class InstSelector implements IRVisitor{
    private ASMBlock curblock = null;
    private ASMFunc curFunc = null;
    public ASMModule asmModule = null;

    public IRModule irModule;

    private PhyReg sp = new PhyReg("sp");
    private PhyReg ra = new PhyReg("ra");
    private PhyReg t0 = new PhyReg("t0");
    private PhyReg t1 = new PhyReg("t1");
    private PhyReg t2 = new PhyReg("t2");
    private PhyReg t3 = new PhyReg("t3");
    private PhyReg t4 = new PhyReg("t4");
    private PhyReg a0 = new PhyReg("a0");

    private ASMReg TransValue(IRBasicValue val) {
        if(val instanceof IRReg) {
            return curFunc.get_VirReg((IRReg) val);
        }else if(val instanceof IRGlobalVar) {
            var tmp = (IRGlobalVar) val;
            VirReg ret = new VirReg(curFunc.allocReg++);
            curblock.push_back(new ASMLaInst( ((IRGlobalVar)val).name,ret));
            asmModule.push_gloVar(tmp.name,tmp.type.Size());
            return ret;
        }else if(val instanceof IRStringConst) {
            String v = ((IRStringConst)val).getString();
            ASMString t = asmModule.get_str(v);
            VirReg ret = new VirReg(curFunc.allocReg++);
            curblock.push_back(new ASMLaInst( ".LC_Mxstr" + t.id,ret));
            return ret;
        }else {
            int value = 0;
            if(val instanceof IRIntConst) value = ((IRIntConst)val).val;
            else if(val instanceof IRBoolConst) value = ((IRBoolConst)val).val ? 1 : 0;
            VirReg ret = new VirReg(curFunc.allocReg++);
            curblock.push_back(new ASMLiInst(ret,new ASMImm(value)));
            return ret;
        }
    }

    private int getConstVal(IRBasicValue v) {
        if(v instanceof IRIntConst) return ((IRIntConst)v).val;
        else if(v instanceof IRNullConst)return 0;
        else return ((IRBoolConst)v).val ? 1 : 0;
    }

    public InstSelector(ASMModule st,IRModule irModule) {
        this.asmModule = st;
        this.irModule = irModule;
        visit(irModule);
    }

    private void visit(IRModule irModule) {
        //GlobalVar
        //String
        //Func
        visit(irModule.init);
        for(var v:irModule.Func) visit(v);
    }

    private void visit(IRFunc func) {
        ASMFunc asmFunc = new ASMFunc(func.name);
        asmModule.func_list.add(asmFunc);
        curFunc = asmFunc;
        if(func.retVal == null) asmFunc.retASMReg = null;
        else asmFunc.retASMReg = asmFunc.get_VirReg(func.retVal);
        for(var v: func.block) {
            ASMBlock asmBlock = new ASMBlock(v.get_label());
            curblock = asmBlock;
            visit(v);
            asmFunc.add_block(asmBlock);
        }
        for(var v: func.arg_list)
            asmFunc.arg_list.add( asmFunc.get_VirReg(v) );

        asmFunc.arg_listReg = Math.max(0,asmFunc.arg_list.size()-8);

        asmFunc.RetBlock = curblock = new ASMBlock(func.RetBlock.get_label());
        visit(func.RetBlock);

        //change sp and store ra
        for(int i=0; i<asmFunc.arg_list.size() ;i++) {
            ASMReg rd = asmFunc.arg_list.get(i);
            if(i < 8) {
                asmFunc.list.get(0).push_front( new ASMMvInst(new PhyReg("a" +i),rd) );
            }else {
                asmFunc.list.get(0).push_front( new ASMLoadInst(4,rd,sp,new ASMImm(asmFunc.Stack_Size() - 4 * (i-7)) ) );
            }
        }
        asmFunc.list.get(0).push_front(new ASMStoreInst(4,sp,ra,new ASMImm(0) ));
        asmFunc.list.get(0).push_front(new ASMCalciInst(sp,new ASMImm(-asmFunc.Stack_Size()),sp,"addi"));

        if(asmFunc.retASMReg != null)
            asmFunc.RetBlock.push_back(new ASMMvInst(asmFunc.retASMReg,a0));

        asmFunc.RetBlock.push_back(new ASMLoadInst(4,ra,sp,new ASMImm(0) ));
        asmFunc.RetBlock.push_back(new ASMCalciInst(sp,new ASMImm(asmFunc.Stack_Size()),sp,"addi"));
        asmFunc.RetBlock.push_back(new ASMRetInst());
    }

    private void visit(IRBlock block) {
        for(var v: block.list) v.accept(this);
        if(block.terminalInst !=null) block.terminalInst.accept(this);
    }

    @Override
    public void visit(IRCalcInst it){
        String ASMop = it.op;
        switch (it.op) {
            case "sdiv": ASMop = "div";break;
            case "srem": ASMop = "rem";break;
            case "shl": ASMop = "sll";break;
            case "ashr": ASMop = "sra";break;
            default:break;
        }
        curblock.push_back(new ASMCalcInst(TransValue(it.rs1),TransValue(it.rs2),TransValue(it.rd),ASMop));
    }
    @Override
    public void visit(IRSelfInst it){
        ASMReg rs1 = TransValue(it.rs), rd = TransValue(it.rd);
        if(it.op.equals("PlusPlus")) {
            curblock.push_back(new ASMCalciInst(rs1,new ASMImm(1),rd,"addi"));
        }else if(it.op.equals("MinusMinus")) {
            curblock.push_back(new ASMCalciInst(rs1,new ASMImm(-1),rd,"addi"));
        }else {
            if(!(it.rd.type instanceof IRBoolType))
                curblock.push_back(new ASMCalciInst(rs1,null,rd,it.op));
            else curblock.push_back(new ASMCalciInst(rs1,new ASMImm(1),rd,"xori"));
        }
    }
    @Override
    public void visit(IRBranchInst it){
        ASMReg condition = TransValue(it.condition);
        curblock.push_back(new ASMBeqzInst(condition,it.Fblock.get_label()));
        curblock.push_back(new ASMJumpInst(it.Tblock.get_label()));
    }
    @Override
    public void visit(IRCompareInst it){
        ASMReg rs1 = TransValue(it.rs1),rs2 = TransValue(it.rs2),rd = TransValue(it.rd);
        switch (it.op) {
            case "sge"://>=
                curblock.push_back(new ASMCalcInst(rs1,rs2,t4,"slt"));
                curblock.push_back(new ASMCalciInst(t4,new ASMImm(1),rd,"xori"));
                break;
            case "sgt"://>
                curblock.push_back(new ASMCalcInst(rs2,rs1,rd,"slt"));
                break;
            case "sle"://<=
                curblock.push_back(new ASMCalcInst(rs2,rs1,t4,"slt"));
                curblock.push_back(new ASMCalciInst(t4,new ASMImm(1),rd,"xori"));
                break;
            case "slt"://<
                curblock.push_back(new ASMCalcInst(rs1,rs2,rd,"slt"));
                break;
            case "eq":
                curblock.push_back(new ASMCalcInst(rs1,rs2,t4,"sub"));
                curblock.push_back(new ASMCalciInst(t4,null,rd,"seqz"));
                break;
            case "ne":
                curblock.push_back(new ASMCalcInst(rs1,rs2,t4,"sub"));
                curblock.push_back(new ASMCalciInst(t4,null,rd,"snez"));
                break;
        }
    }
    @Override
    public void visit(IRRetInst it){
        if(curFunc.retASMReg != null)
            curblock.push_back(new ASMMvInst(TransValue(it.ret),curFunc.retASMReg) );
    }
    @Override
    public void visit(IRLoadInst it){
        curblock.push_back(new ASMLoadInst(it.rd.type.Size(),TransValue(it.rd),TransValue(it.src),new ASMImm(0)));
    }
    @Override
    public void visit(IRStoreInst it){
        curblock.push_back(new ASMStoreInst(((IRPtrType)it.addr.type).LoadType().Size(),TransValue(it.addr),TransValue(it.val),new ASMImm(0)));
    }
    @Override
    public void visit(IRAllocaInst it){
        assert false;
        VirReg Vreg = new VirReg(curFunc.allocReg++);
        curblock.push_back(new ASMCalciInst(sp,new ASMImm(Vreg.index*4),TransValue(it.reg),"addi"));
    }
    @Override
    public void visit(IRCallInst it){

        for(int i=0;i<it.arg_list.size();i++) {
            var v = TransValue(it.arg_list.get(i));
            var bit = it.arg_list.get(i).type.Size();
            if(i<8) curblock.push_back(new ASMMvInst(v,new PhyReg("a" + i)));
            else curblock.push_back(new ASMStoreInst(bit,sp,v,new ASMImm(-4*(i-7))));
        }

        curblock.push_back(new ASMCallInst(it.func_name));

        if(! (it.retType instanceof IRVoidType)) {
            curblock.push_back(new ASMMvInst(a0,TransValue(it.rd)));
        }
    }
    @Override
    public void visit(IRJumpInst it){
        curblock.push_back(new ASMJumpInst(it.to.get_label()));
    }
    @Override
    public void visit(IRTruncInst it){
        curblock.push_back(new ASMMvInst( TransValue(it.val),TransValue(it.rd) ));
    }
    @Override
    public void visit(IRGEPInst it){
        ASMReg src = TransValue(it.src), rd = TransValue(it.rd);
        if(it.index.size() == 1) {
            ASMReg index = TransValue(it.index.get(0));
            ASMReg sz = new VirReg(curFunc.allocReg++);
            curblock.push_back( new ASMLiInst(sz,new ASMImm(it.type.Size())) );
            curblock.push_back( new ASMCalcInst(sz,index,sz,"mul") );
            curblock.push_back( new ASMCalcInst(src,sz,rd,"add") );
        }else {
            int index = ((IRIntConst)it.index.get(1)).val;
            IRType irType = ((IRPtrType)it.src.type).LoadType();
            if(irType instanceof IRClassType) {
                IRClassType curC = (IRClassType) irType;
                int imm = 0;
                for(int i=0;i<index;i++) imm += curC.list.get(i).Size();
                curblock.push_back( new ASMCalciInst(src,new ASMImm(imm),rd,"addi") );
            }else {
                curblock.push_back( new ASMMvInst(src,rd) );
            }
        }
    }
    @Override
    public void visit(IRBitcastInst it){
        curblock.push_back(new ASMMvInst( TransValue(it.val),TransValue(it.rd) ));
    }
    @Override
    public void visit(IRZextInst it){
        curblock.push_back(new ASMMvInst( TransValue(it.val),TransValue(it.rd) ));
    }

    @Override
    public void visit(IRPhiInst it){};

    @Override
    public void visit(IRMvInst it) {
        if(it.rs instanceof IRConst && ! (it.rs instanceof  IRStringConst)) {
            curblock.push_back(new ASMLiInst(TransValue(it.rd),new ASMImm(getConstVal(it.rs))));
        }else curblock.push_back(new ASMMvInst(TransValue(it.rs),TransValue(it.rd)));
    }
}