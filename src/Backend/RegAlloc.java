package Backend;

import ASM.ASMBlock;
import ASM.ASMFunc;
import ASM.ASMInst.*;
import ASM.ASMModule;
import ASM.Operand.ASMImm;
import ASM.Operand.ASMReg;
import ASM.Operand.PhyReg;
import ASM.Operand.VirReg;
import IR.IRBlock;
import IR.IRFunc;
import IR.IRModule;

import java.util.ArrayList;

public class RegAlloc {
    public ASMModule asmModule = null;
    private ASMBlock curblock = null;
    private ASMFunc curFunc = null;

    private PhyReg sp = new PhyReg("sp");
    private PhyReg ra = new PhyReg("ra");
    private PhyReg t0 = new PhyReg("t0");
    private PhyReg t1 = new PhyReg("t1");
    private PhyReg t2 = new PhyReg("t2");
    private PhyReg t3 = new PhyReg("t3");
    private PhyReg a0 = new PhyReg("a0");

    public RegAlloc(ASMModule st) {
        this.asmModule = st;
        Reg_Alloc();
    }

    private void Reg_Alloc() {
        //GlobalVar
        //String
        //Func
        for(var v:asmModule.func_list) visit(v);
    }

    private void visit(ASMFunc func) {
        curFunc = func;
        ArrayList<ASMBlock> list = new ArrayList<>();
        for(var v:func.list) list.add(visit(v));
        func.list = list;
        func.RetBlock = visit(func.RetBlock);
    }

    boolean check(int imm) {
        return imm >= -2048 && imm < 2048;
    }

    void getPhyReg(VirReg reg,PhyReg rd) {
        int index = reg.index*4;
        if(check(index)){
            curblock.push_back(new ASMLoadInst(4,rd,sp,new ASMImm(index)));
        }else {
            curblock.push_back(new ASMLiInst(t3,new ASMImm(index)));
            curblock.push_back(new ASMCalcInst(t3,sp,t3,"add"));
            curblock.push_back(new ASMLoadInst(4,rd,t3,new ASMImm(0)));
        }
    }

    void UpdateVirReg(VirReg rd,PhyReg reg) {
        int index = rd.index*4;
        if(check(index)){
            curblock.push_back(new ASMStoreInst(4,sp,reg,new ASMImm(index)));
        }else {
            curblock.push_back(new ASMLiInst(t3,new ASMImm(index)));
            curblock.push_back(new ASMCalcInst(t3,sp,t3,"add"));
            curblock.push_back(new ASMStoreInst(4,t3,reg,new ASMImm(0)));
        }
    }

    void solve(ASMInst inst) {
        if(inst.rs1 != null && inst.rs1 instanceof VirReg) {
            getPhyReg((VirReg) inst.rs1, t0);
            inst.rs1 = t0;
        }
        if(inst.rs2 != null && inst.rs2 instanceof VirReg) {
            getPhyReg((VirReg) inst.rs2, t1);
            inst.rs2 = t1;
        }
        VirReg dest = null;
        if(inst.rd != null && inst.rd instanceof VirReg) {
            dest = (VirReg) inst.rd;
            inst.rd = t2;
        }
        if(inst instanceof ASMCalciInst) {
            ASMCalciInst Inst = (ASMCalciInst)inst;
            if(!Inst.op.equals("addi") || check(Inst.imm.imm)) curblock.push_back(inst);
            else {
                curblock.push_back(new ASMLiInst(t1,Inst.imm));
                curblock.push_back(new ASMCalcInst(inst.rs1,t1,inst.rd,"add"));
            }
        } else if(inst instanceof ASMLoadInst) {
            ASMLoadInst Inst = (ASMLoadInst)inst;
            if(check(Inst.imm.imm)) curblock.push_back(inst);
            else {
                curblock.push_back(new ASMLiInst(t3,Inst.imm));
                curblock.push_back(new ASMCalcInst(inst.rs1,t3,t3,"add"));
                curblock.push_back(new ASMLoadInst(Inst.bit,Inst.rd,t3,new ASMImm(0)));
            }
        } else if(inst instanceof ASMStoreInst) {
            ASMStoreInst Inst = (ASMStoreInst)inst;
            if(check(Inst.imm.imm)) curblock.push_back(inst);
            else {
                curblock.push_back(new ASMLiInst(t3,Inst.imm));
                curblock.push_back(new ASMCalcInst(inst.rs1,t3,t3,"add"));
                curblock.push_back(new ASMStoreInst(Inst.bit,t3,Inst.rs2,new ASMImm(0)));
            }
        }else curblock.push_back(inst);
        if(dest != null)UpdateVirReg(dest,t2);
    }

    private ASMBlock visit(ASMBlock bk) {
//        curblock = bk;
        curblock = new ASMBlock(bk.label);
        for(var inst:bk.list) solve(inst);
        return curblock;
    }

}
