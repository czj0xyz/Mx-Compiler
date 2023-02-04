package Backend;

import ASM.ASMFunc;
import ASM.ASMModule;
import IR.IRModule;

public class LivenessAnalysis {
    public ASMFunc asmFunc;

    public LivenessAnalysis(ASMFunc asmFunc) {
        this.asmFunc = asmFunc;
        solve(asmFunc);
    }

    private void solve(ASMFunc func) {
        for(var v: func.list) {
            v.Update_use_def();
            v.in.clear();
            v.out.clear();
        }
        func.RetBlock.Update_use_def();
        //work
        boolean flg = true;
        while(flg) {
            flg = false;
            for(var v:func.list) flg |= v.Update_live();
            flg |= func.RetBlock.Update_live();
        }
    }
}
