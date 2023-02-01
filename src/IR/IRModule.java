package IR;

import IR.IRInst.IRInst;
import IR.IRInst.IRJumpInst;
import IR.IRInst.IRRetInst;
import IR.IRType.IRClassType;
import IR.IRType.IRVoidType;
import IR.IRValue.IRConst.IRConst;
import IR.IRValue.IRConst.IRStringConst;
import IR.IRValue.IRGlobalVar;
import Util.Scope.GlobalScope;

import java.sql.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class IRModule {
    public ArrayList<IRFunc> Func = new ArrayList<>();
    public ArrayList<IRGlobalVar> GlobalVar = new ArrayList<>();
    public ArrayList<IRStringConst> Strings = new ArrayList<>();

    public HashMap<String,IRStringConst> map = new HashMap<>();

    public ArrayList<IRClassType> ClassList = new ArrayList<>();

    public IRFunc MainFn,init;

    public IRBlock GlobalBlock;

    public IRModule() {
        init = new IRFunc("__init_for_global_variables" , new IRVoidType() );
        init.RetBlock = new IRBlock("return");
        init.RetBlock.push_back(new IRRetInst(new IRConst(new IRVoidType())));
        init.block.add( new IRBlock("entry",new IRJumpInst(init.RetBlock) ));
        GlobalBlock = init.block.get(0);
    }

    public IRBlock qblock() {
        return GlobalBlock;
    }

    public IRStringConst addStringConst(IRStringConst v) {
        var str = v.getString();
        if(!map.containsKey(str)) {
            map.put(str,v);
            Strings.add(v);
        }
        return map.get(str);
    }

}
