package Util.Scope;
import java.util.HashMap;
import Util.Type.*;
public class Scope {
    //className x typeName and funcName
    private HashMap<String, BaseType> IDMap = new HashMap<>();
    private HashMap<String, BaseType> varMap = new HashMap<>();
    private HashMap<String, FuncType> funcMap = new HashMap<>();
    private Scope par;

    public Scope(Scope fa) {
        this.par = fa;
    }
    


}
