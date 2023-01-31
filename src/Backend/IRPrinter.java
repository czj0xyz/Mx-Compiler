package Backend;

import IR.IRModule;
import IR.IRType.IRPtrType;

public class IRPrinter {

    public IRPrinter(){}

    public String Print(IRModule irModule) {

        String ret = "target datalayout = \"e-m:e-p270:32:32-p271:32:32-p272:64:64-i64:64-f80:128-n8:16:32:64-S128\"\n";
        ret += "target triple = \"x86_64-pc-linux-gnu\"\n\n";
        //Class Def

        for(var v: irModule.ClassList) {
            ret += v + " = type{ ";
            for(int i=0;i<v.list.size();i++) {
                ret += v.list.get(i);
                if(i+1 < v.list.size())
                    ret += ", ";
            }
            ret += " }\n";
        }
        ret += "\n";

        //String

        for(var v: irModule.Strings) {
            ret += v.toString_val() + " = dso_local global " + v.toString_global() + "\n";
        }
        ret += "\n";

        //Global Vars

        for(var v: irModule.GlobalVar) {
            ret += v.toString_val() + " = dso_local global " + v.init_val.toString_type_val() + "\n";
        }
        ret += "\n";

        //Function Def

        ret += "declare dso_local i8* @malloc(i32)\n";
        ret += "declare dso_local i8* @strcpy(i8*, i8*)\n";
        ret += "declare dso_local i8* @strcat(i8*, i8*)\n";
        ret += "declare dso_local i32 @strlen(i8*)\n";
        ret += "declare dso_local i32 @memcpy(i8*, i8*, i64, i1)\n";
        ret += "declare void @print(i8*)\n";
        ret += "declare void @println(i8*)\n";
        ret += "declare void @printInt(i32)\n";
        ret += "declare void @printlnInt(i32)\n";
        ret += "declare void @printlnIntPoint(i32*)\n";
        ret += "declare i8* @getString()\n";
        ret += "declare i32 @getInt()\n";
        ret += "declare i8* @toString(i32)\n";
        ret += "declare i8* @__str_substring(i8*, i32, i32)\n";
        ret += "declare i32 @__str_parseInt(i8*)\n";
        ret += "declare i8* @__str_add(i8*, i8*)\n";
        ret += "declare i32 @__str_ord(i8*, i32)\n";
        ret += "declare i8  @__str_slt(i8*, i8*)\n";
        ret += "declare i8  @__str_sle(i8*, i8*)\n";
        ret += "declare i8  @__str_sgt(i8*, i8*)\n";
        ret += "declare i8  @__str_sge(i8*, i8*)\n";
        ret += "declare i8  @__str_eq(i8*, i8*)\n";
        ret += "declare i8  @__str_ne(i8*, i8*)\n\n";

        ret += irModule.init + "\n\n";
        for(var v:irModule.Func) {
            ret += v + "\n\n";
        }

        return ret;
    }
}
