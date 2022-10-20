package Util.Type;

import Util.Position;

public class BaseType {
    public Position position;
    boolean isInt,isBool,isString,isClass;

    public BaseType(){}
    public BaseType(Position pos,int type) {
        this.position = pos;
        this.isInt = this.isBool = this.isString = this.isClass = false;
        if(type==0)this.isInt = true;
        else if(type==1)this.isBool = true;
        else if(type==2)this.isString = true;
        else if(type==3)this.isClass = true;
    }
    public String getType() {
        if(isInt)return "int";
        else if(isBool)return "bool";
        else if(isString)return "string";
        else return "void";
    }

    public int getTypeId() {
        if(isInt)return 0;
        if(isBool)return 1;
        if(isString)return 2;
        if(isClass)return 3;
        return 4;
    }
}
