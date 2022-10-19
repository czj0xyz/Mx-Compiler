package Util.Type;


import Util.Position;
import Util.Type.*;
import Util.error.SemanticError;

import java.util.ArrayList;

public class FuncType{
    public Position position;
    public String name;
    public ArrayList<BaseType> arg_list = new ArrayList<BaseType>();

    public FuncType(Position p) {
        this.position = p;
    }

    public void push(BaseType node) {
        this.arg_list.add(node);
    }

    public void check(ArrayList<BaseType> arg_list2) {
        if(this.arg_list.size() != arg_list2.size())
            throw new SemanticError("Type mismatched in function "  , position);
        for(int i=0;i<arg_list2.size();i++)
            throw new SemanticError("Type mismatched in function "  , position);

    }

}
