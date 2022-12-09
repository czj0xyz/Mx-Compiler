package Util.Type;


import Util.Position;
import Util.Type.*;
import Util.error.SemanticError;

import java.util.ArrayList;

public class FuncType{
    public Position position;
    public String name;
    public BaseType ret;
    public ArrayList<BaseType> arg_list = new ArrayList<BaseType>();

    public FuncType(Position p,String name_,BaseType ret_) {
        this.position = p;
        this.name = name_;
        this.ret = ret_;
    }
    public FuncType(Position p,String name_,BaseType t,BaseType ret_) {
        this.name = name_;
        this.arg_list.add(t);
        this.position = p;
        this.ret = ret_;
    }

    public void push(BaseType node) {
        this.arg_list.add(node);
    }

    public void check(ArrayList<BaseType> arg_list2) {
        if(this.arg_list.size() != arg_list2.size())
            throw new SemanticError("Type mismatched in function "  , position);
        for(int i=0;i<arg_list2.size();i++)
            if(!arg_list2.get(i).getType().equals(arg_list.get(i).getType()))
                throw new SemanticError("Type mismatched in function "  , position);

    }

}
