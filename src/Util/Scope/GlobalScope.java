package Util.Scope;

import Util.Position;
import Util.Type.BaseType;
import Util.Type.FuncType;

import java.util.HashMap;
import Util.Type.*;
import Util.error.SemanticError;

public class GlobalScope extends Scope {
    private HashMap<String, FuncType> funcMap = new HashMap<>();

    private HashMap<String, ClassType> ClassMap = new HashMap<>();

    public GlobalScope par;

    public GlobalScope(GlobalScope par_) {
        this.par = par_;
        if(par == null) {
            funcMap.put("print", new FuncType(new Position(), "print", new BaseType(2), new BaseType(4)));
            funcMap.put("println", new FuncType(new Position(), "println", new BaseType(2), new BaseType(4)));
            funcMap.put("printInt", new FuncType(new Position(), "printInt", new BaseType(0), new BaseType(4)));
            funcMap.put("printlnInt", new FuncType(new Position(), "printlnInt", new BaseType(0), new BaseType(4)));
            funcMap.put("getString", new FuncType(new Position(), "getString", new BaseType(2)));
            funcMap.put("getInt", new FuncType(new Position(), "getInt", new BaseType(0)));
            funcMap.put("toString", new FuncType(new Position(), "toString", new BaseType(0), new BaseType(2)));
        }
    }

    public boolean containsClass(String name) {
        if(ClassMap.containsKey(name))return true;
        if(par != null) return par.containsClass(name);
        return false;
    }
    public boolean containsfunc(String name){ return funcMap.containsKey(name);}

    public void put_func(FuncType func,String name) {
        if( funcMap.containsKey(name) )
            throw new SemanticError("Semantic Error: name redefine", func.position);
        funcMap.put(name,func);
    }

    public FuncType getFunc(String name) {
        if(funcMap.containsKey(name)) return funcMap.get(name);
        if(par != null)return par.getFunc(name);
        return null;
    }

    public void put_class(ClassType type, String name, Position position) {
        if(ClassMap.containsKey(name))
            throw new SemanticError("Semantic Error: name redefine", position);
        ClassMap.put(name,type);
    }
}
