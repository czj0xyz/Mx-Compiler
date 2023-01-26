package IR.IRType;

import IR.IRFunc;

import java.util.ArrayList;
import java.util.Map;

public class IRClassType extends IRType{
    public String name;
    public ArrayList<IRType> list = new ArrayList<>();
    public Map<String,IRType> pos;
    public IRFunc builtin;

    public IRClassType(String name) {
        super();
        this.name = name;
        this.builtin = null;
    }

    public void insert(String name, IRType t) {
        list.add(t);
        pos.put(name,t);
    }

    @Override
    public int Size() {
        int ret = 0;
        for(var v: list) ret += v.Size();
        return ret;
    }

}
