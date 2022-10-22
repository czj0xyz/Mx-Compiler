package Util.Scope;
import java.util.HashMap;

import Util.Position;
import Util.Type.*;
import Util.error.SemanticError;

public class Scope {
    //className x typeName and funcName
    private HashMap<String, BaseType> varMap = new HashMap<>();
    private Scope par;
    public boolean in_class,in_func;
    public int loop_cnt;

    public BaseType func_ret;

    public Scope(){
        in_class = in_func = false;
        loop_cnt = 0;
        par = null;
        func_ret = new BaseType();
    }

    public Scope(Scope fa,boolean in_class_,boolean in_func_) {
        this.par = fa;
        this.in_class = in_class_;
        this.in_func = in_func_;
        if(fa != null){
            this.loop_cnt = fa.loop_cnt;
            this.func_ret = fa.func_ret;
        }
        else {
            this.loop_cnt = 0;
            this.func_ret = new BaseType();
        }
    }
    public Scope parScope() {
        return this.par;
    }

    public void put_def(BaseType type, String name, Position position) {
        if( varMap.containsKey(name) )
            throw new SemanticError("Semantic Error: name redefine", position);
        varMap.put(name,type);
    }

    public boolean containsVar(String name) {
        if(varMap.containsKey(name)) return true;
        if(par != null)return par.containsVar(name);
        return false;
    }

    public String getTypeName(String name) {
        if(varMap.containsKey(name)) return varMap.get(name).getType();
        if(par != null)return par.getTypeName(name);
        return "";
    }

    public BaseType getType(String name) {
        if(varMap.containsKey(name)) return varMap.get(name);
        if(par != null)return par.getType(name);
        return new BaseType();
    }

}
