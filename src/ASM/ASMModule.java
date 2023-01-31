package ASM;

import ASM.Operand.ASMGlobalVar;
import ASM.Operand.ASMString;
import IR.IRValue.IRConst.IRStringConst;
import IR.IRValue.IRGlobalVar;

import java.util.ArrayList;

public class ASMModule {

    public ArrayList<ASMFunc> func_list;
    public ArrayList<ASMGlobalVar> GlobalVar = new ArrayList<>();
    public ArrayList<ASMString> Strings = new ArrayList<>();

    public ASMModule() {

    }

    public String toString() {
        return "";
    }
}
