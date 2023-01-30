package IR.IRType;

import IR.IRFunc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class IRClassType extends IRType{
    public String name;
    public ArrayList<IRType> list = new ArrayList<>();
    public HashMap<String,Integer> pos = new HashMap<>();
    public HashMap<String,IRType> ir_Type = new HashMap<>();
    public boolean builtin;
    int tt_sz;

    public IRClassType(String name) {
        super();
        this.name = name;
        this.builtin = false;
        this.tt_sz = 0;
    }

    public void insert(String name, IRType t) {
        pos.put(name,tt_sz);
        ir_Type.put(name,t);
        list.add(t);
        tt_sz += t.Size();
    }

    @Override
    public int Size() {
        return tt_sz;
//        int ret = 0;
//        for(var v: list) ret += v.Size();
//        return ret;
    }

    @Override
    public String toString() {
        return "%" + name;
    }

}
