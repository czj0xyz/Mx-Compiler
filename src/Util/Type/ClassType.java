package Util.Type;

import Util.Position;
import Util.error.SemanticError;

import java.util.ArrayList;
import java.util.HashMap;

public class ClassType extends BaseType{
    public String name;
    HashMap<String,BaseType> varMap = new HashMap<>();

    HashMap<String,FuncType> funcMap = new HashMap<>();

    public ArrayList<BaseType> vars = new ArrayList<>();
    public ArrayList<String> vars_name = new ArrayList<>();

    public void pushMem(BaseType Type,String Name,Position position) {
        if(varMap.containsKey(Name))
            throw new SemanticError("redeclaration of " + Type.getType() + " " + Name,position);
        varMap.put(Name,Type);
        vars.add(Type);
        vars_name.add(Name);
    }

    public BaseType getMem(String Name,Position position) {
        if(!varMap.containsKey(Name))
            throw new SemanticError("class" + name + " has no member named " + Name,position);
        return varMap.get(Name);
    }

    public void putFunc(FuncType func,String Name,Position position) {
        if(funcMap.containsKey(Name))
            throw new SemanticError("redeclaration of function " + Name,position);
        funcMap.put(Name,func);
    }

    public BaseType check_func(ArrayList<BaseType> list,String Name,Position position) {
        if(!funcMap.containsKey(Name))
            throw new SemanticError("class" + name + " has no function named " + Name,position);
        funcMap.get(Name).check(list);
        return funcMap.get(Name).ret;
    }

    public BaseType get_func_ret(String Name) {
        return funcMap.get(Name).ret;
    }

    public boolean hv_func(String name) {
        return funcMap.containsKey(name);
    }

    public ClassType(Position pos,String Name) {
        super(3);
        this.name=Name;
    }


    @Override
    public String getType() {
        return name;
    }

    @Override
    public String getBaseType() {
        return name;
    }

    @Override
    public boolean Primitive() {
        return false;
    }
}
