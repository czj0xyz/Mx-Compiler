package IR;

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

    public HashMap<String,IRStringConst> map;

    IRFunc MainFn;

    public IRModule() {
    }

    public void addStringConst(IRStringConst v) {
        var str = v.getString();
        if(!map.containsKey(str)) {
            map.put(str,v);
            Strings.add(v);
        }
    }

}
