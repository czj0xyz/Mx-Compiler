package Util.Type;

import Frontend.SemanticChecker;
import Util.Position;
import Util.error.SemanticError;

public class BaseType {
    boolean isInt,isBool,isString,isClass,isVoid;

    public BaseType(){}
    public BaseType(int type) {
        this.isInt = this.isBool = this.isString = this.isClass = this.isVoid = false;
        if(type==0)this.isInt = true;
        else if(type==1)this.isBool = true;
        else if(type==2)this.isString = true;
        else if(type==3)this.isClass = true;
        else if(type==4)this.isVoid = true;
    }
    public String getType() {
        if(isInt)return "int";
        else if(isBool)return "bool";
        else if(isString)return "string";
        else if(isVoid) return "void";
        else throw new SemanticError("I got smoke",new Position());
//        return "???";
    }

    public int getTypeId() {
        if(isInt)return 0;
        if(isBool)return 1;
        if(isString)return 2;
        if(isClass)return 3;
        return 4;
    }

    public String getBaseType() {
        return getType();
    }

    public BaseType ArrayAtom(){
        return new BaseType();
    }
}
