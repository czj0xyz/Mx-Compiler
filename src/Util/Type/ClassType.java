package Util.Type;

import Util.Position;
import Util.error.SemanticError;

import java.util.ArrayList;
import java.util.HashMap;

public class ClassType extends BaseType{
    String name;
    HashMap<String,BaseType> varMap = new HashMap<>();

    HashMap<String,FuncType> funcMap = new HashMap<>();

    public void pushMem(BaseType Type,String Name) {
        if(varMap.containsKey(Name))
            throw new SemanticError("redeclaration of " + Type.getType() + " " + Name,position);
        varMap.put(Name,Type);
    }

    public BaseType getMem(String Name) {
        if(varMap.containsKey(Name))
            throw new SemanticError("class" + name + " has no member named " + Name,position);
        return varMap.get(Name);
    }

    public void putFunc(FuncType func,String Name) {
        if(funcMap.containsKey(Name))
            throw new SemanticError("redeclaration of function " + Name,position);
        funcMap.put(Name,func);
    }

    public void check_func(ArrayList<BaseType> list,String Name) {
        if(funcMap.containsKey(Name))
            throw new SemanticError("class" + name + " has no function named " + Name,position);
        funcMap.get(Name).check(list);
    }

    public ClassType(Position pos,String Name) {
        super(pos,3);
        this.name=Name;
    }


    @Override
    public String getType() {
        return name;
    }
}
