package IR;

import java.util.ArrayList;
import java.util.LinkedList;

import IR.IRInst.*;


public class IRBlock {
    public LinkedList<IRInst> list = new LinkedList<>();

    public IRBlock() {

    }

    public void push_back(IRInst v) {
        list.add(v);
    }
}
