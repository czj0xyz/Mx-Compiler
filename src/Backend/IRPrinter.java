package Backend;

import IR.IRModule;

public class IRPrinter {

    public IRPrinter(){}

    public String Print(IRModule irModule) {

        String ret = "target datalayout = \"e-m:e-p270:32:32-p271:32:32-p272:64:64-i64:64-f80:128-n8:16:32:64-S128\"\n";
        ret += "target triple = \"x86_64-pc-linux-gnu\"\n\n";
        //Class Def
        //String
        //Global Vars
        //Function Def

        ret += "declare dso_local i8* @malloc(i32)\n";
        ret += "declare dso_local i8* @strcpy(i8*, i8*)\n";
        ret += "declare dso_local i8* @strcat(i8*, i8*)\n";
        ret += "declare dso_local i32 @strlen(i8*)\n";
        ret += "declare void @print(i8*)\n";
        ret += "declare void @println(i8*)\n";
        ret += "declare void @printInt(i32)\n";
        ret += "declare void @printlnInt(i32)\n";
        ret += "declare i8* @getString()\n";
        ret += "declare i32 @getInt()\n";
        ret += "declare i8* @toString(i32)\n";
        ret += "declare i8* @__mx_substring(i8*, i32, i32)\n";
        ret += "declare i32 @__mx_parseInt(i8*)\n";
        ret += "declare i32 @__mx_ord(i8*, i32)\n";
        ret += "declare i8 @__mx_strlt(i8*, i8*)\n";
        ret += "declare i8 @__mx_strle(i8*, i8*)\n";
        ret += "declare i8 @__mx_strgt(i8*, i8*)\n";
        ret += "declare i8 @__mx_strge(i8*, i8*)\n";
        ret += "declare i8 @__mx_streq(i8*, i8*)\n";
        ret += "declare i8 @__mx_strneq(i8*, i8*)\n\n";

        for(var v:irModule.Func) {
            ret += v;
        }

        return ret;
    }
}
