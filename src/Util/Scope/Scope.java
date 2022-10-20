package Util.Scope;
import java.util.HashMap;
import Util.Type.*;
import Util.error.SemanticError;

public class Scope {
    //className x typeName and funcName
    private HashMap<String, BaseType> ClassMap = new HashMap<>();
    private HashMap<String, BaseType> varMap = new HashMap<>();
    private HashMap<String, FuncType> funcMap = new HashMap<>();
    private Scope par;
    boolean in_class,in_func;

    public Scope(Scope fa,boolean in_class_,boolean in_func_) {
        this.par = fa;
        this.in_class = in_class_;
        this.in_func = in_func_;
    }

    public Scope parScope() {
        return this.par;
    }

    public void put_def(BaseType type, String name) {
        if(type.getTypeId() == 3) {
            if(ClassMap.containsKey(name))
                throw new SemanticError("Semantic Error: name redefine", type.position);
            ClassMap.put(name,type);
            return;
        }
        if(varMap.containsKey(name) || funcMap.containsKey(name))
            throw new SemanticError("Semantic Error: name redefine", type.position);
        varMap.put(name,type);
    }

    public void put_func(FuncType func,String name) {
        if(varMap.containsKey(name) || funcMap.containsKey(name))
            throw new SemanticError("Semantic Error: name redefine", func.position);
        funcMap.put(name,func);
    }

    public boolean containsVar(String name) {
        return varMap.containsKey(name);
    }

    public boolean containsClass(String name) {
        return ClassMap.containsKey(name);
    }

    public BaseType getType(String name) {
        if(varMap.containsKey(name)) return varMap.get(name);
        return null;
    }

    public FuncType getFunc(String name) {
        if(funcMap.containsKey(name)) return funcMap.get(name);
        return null;
    }
}
