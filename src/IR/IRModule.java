package IR;

import IR.IRValue.IRConst.IRStringConst;
import IR.IRValue.IRGlobalVar;
import Util.Scope.GlobalScope;

import java.sql.Array;
import java.util.ArrayList;

public class IRModule {
    public ArrayList<IRFunc> Func = new ArrayList<>();
    public ArrayList<IRGlobalVar> GlobalVar = new ArrayList<>();
    public ArrayList<IRStringConst> Strings = new ArrayList<>();

    IRFunc MainFn;

    public IRModule() {

    }
}
