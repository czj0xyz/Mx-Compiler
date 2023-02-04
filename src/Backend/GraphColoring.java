package Backend;

import ASM.ASMBlock;
import ASM.ASMFunc;
import ASM.ASMInst.*;
import ASM.ASMModule;
import ASM.Operand.ASMImm;
import ASM.Operand.ASMReg;
import ASM.Operand.PhyReg;
import ASM.Operand.VirReg;
import jdk.jfr.Enabled;
import org.antlr.v4.runtime.misc.Pair;

import java.lang.reflect.Array;
import java.util.*;

public class GraphColoring {
    public ASMModule asmModule;
    public ASMFunc curFunc;

    public int K = 12;

    public GraphColoring(ASMModule asmModule) {
        this.asmModule = asmModule;
        solve();
    }

    public void solve() {
        for(var v:asmModule.func_list) visit(v);
    }

    void visit(ASMFunc tmp) {
//        if(!tmp.name.equals("search"))return;
        curFunc = tmp;
        initial.clear();
        for(int i=1;i<curFunc.allocReg;i++) initial.add(curFunc.get_VirReg(i));

        Main();
//        System.out.println(curFunc.allocReg);
//        for(int i=1;i<curFunc.allocReg;i++) System.out.println(ReplaceReg(curFunc.get_VirReg(i)));


        for(int i=0; i<curFunc.arg_list.size() ;i++) {
            ASMReg rd = curFunc.arg_list.get(i);
            if(i < 8) {
                curFunc.list.get(0).push_front( new ASMMvInst(new PhyReg("a" +i),ReplaceReg(rd)) );
            }else {
                curFunc.list.get(0).push_front( new ASMLoadInst(4,ReplaceReg(rd),asmModule.sp,new ASMImm(curFunc.Stack_Size() - 4 * (i-7)) ) );
            }
        }
        curFunc.list.get(0).push_front(new ASMStoreInst(4,asmModule.sp,asmModule.ra,new ASMImm(0) ));

        for(int i=0;i<=curFunc.MaxUsed;i++)
            curFunc.list.get(0).push_front(new ASMStoreInst(4,asmModule.sp,asmModule.pos.get("s" + i),new ASMImm(i*4+4) ));

        curFunc.list.get(0).push_front(new ASMCalciInst(asmModule.sp,new ASMImm(-curFunc.Stack_Size()),asmModule.sp,"addi"));

        if(curFunc.retASMReg != null) {
            curFunc.RetBlock.push_back(new ASMMvInst(ReplaceReg(curFunc.retASMReg), asmModule.a0));
        }

        curFunc.RetBlock.push_back(new ASMLoadInst(4,asmModule.ra,asmModule.sp,new ASMImm(0) ));
        for(int i=0;i<=curFunc.MaxUsed;i++)
            curFunc.RetBlock.push_back(new ASMLoadInst(4,asmModule.pos.get("s" + i), asmModule.sp, new ASMImm(i*4+4)));
        curFunc.RetBlock.push_back(new ASMCalciInst(asmModule.sp,new ASMImm(curFunc.Stack_Size()),asmModule.sp,"addi"));
        curFunc.RetBlock.push_back(new ASMRetInst());
    }

    HashSet<Pair<ASMReg,ASMReg> > adjSet = new HashSet<>();
    HashMap<ASMReg, HashSet<ASMReg> > adjList = new HashMap<>();
    HashMap<ASMReg,Integer> color = new HashMap<>();
    HashMap<ASMReg,Integer> deg = new HashMap<>();

    LinkedList<ASMMvInst> coalescedMoves = new LinkedList<>();
    LinkedList<ASMMvInst> constrainedMoves = new LinkedList<>();
    LinkedList<ASMMvInst> frozenMoves = new LinkedList<>();
    LinkedList<ASMMvInst> worklistMoves = new LinkedList<>();
    LinkedList<ASMMvInst> activeMoves = new LinkedList<>();

    HashMap<ASMReg, HashSet<ASMMvInst>> moveList = new HashMap<>();

    LinkedList<ASMReg> spillWorkList = new LinkedList<>();
    LinkedList<ASMReg> freezeWorklist = new LinkedList<>();
    LinkedList<ASMReg> simplifyWorklist = new LinkedList<>();

    Stack<ASMReg> selectStack = new Stack<>();

    HashSet<ASMReg> precolored = new HashSet<>();
    HashSet<ASMReg> initial = new HashSet<>();

    HashSet<ASMReg> coalescedNodes = new HashSet<>();
    HashSet<ASMReg> colored = new HashSet<>();
    HashSet<ASMReg> spilledNodes = new HashSet();

    HashMap<ASMReg,ASMReg> alias = new HashMap<>();

    public void init_precolor(ASMReg reg) {
        precolored.add(reg);
        adjList.put(reg,new HashSet<>());
        color.put(reg,-2);
        colored.add(reg);
        deg.put(reg,0);
        alias.put(reg,reg);
        moveList.put(reg,new HashSet<>());
    }

    public void init() {
        alias.clear();
        spillWorkList.clear();
        freezeWorklist.clear();
        simplifyWorklist.clear();

        adjSet.clear();
        adjList.clear();
        for(var v:initial) adjList.put(v,new HashSet<>());
        color.clear();
        for(var v:initial) color.put(v,-1);
        deg.clear();
        for(var v:initial) deg.put(v,0);
        selectStack.clear();

        coalescedMoves.clear();
        constrainedMoves.clear();
        frozenMoves.clear();
        worklistMoves.clear();
        activeMoves.clear();

        moveList.clear();
        for(var v:initial)  moveList.put(v,new HashSet<>());

        coalescedNodes.clear();
        colored.clear();

        spilledNodes.clear();

        precolored.clear();
        /* sp ra t0-6 s0-11 */
        init_precolor(asmModule.pos.get("ra"));
        init_precolor(asmModule.pos.get("sp"));
        for(int i=0;i<=6;i++) init_precolor(asmModule.pos.get("t" + i));
        for(int i=0;i<=11;i++) init_precolor(asmModule.pos.get("s" + i));
        for(int i=0;i<=7;i++) init_precolor(asmModule.pos.get("a" + i));

    }

    void AddEdge(ASMReg u,ASMReg v) {//u -> v
        var p = new Pair<ASMReg,ASMReg>(u,v);
        if(u == v || adjSet.contains(p))return;
        adjSet.add(p);
        if(precolored.contains(u))return;
//        System.out.println(u + "\t\t" + v);
        adjList.get(u).add(v);
        deg.replace(u,deg.get(u)+1);
    }

    void Build(ASMBlock block) {
        HashSet<ASMReg> live = new HashSet<>();
//        System.out.println(block.label + ":");
        for(var v:block.out) {
            live.add(v);
//            System.out.println(v);
        }
//        System.out.println("-----------");

        for(int i=(Integer) block.list.size()-1;i>=0;i--) {
            var inst = block.list.get(i);
            if(inst instanceof ASMMvInst) {
                ASMMvInst mvInst = (ASMMvInst) inst;
                for(var v:inst.use) if(live.contains(v))live.remove(v);
                for(var v:inst.use) moveList.get(v).add(mvInst);
                for(var v:inst.def) moveList.get(v).add(mvInst);
                worklistMoves.add(mvInst);
            }
            for(var v:inst.def) live.add(v);
            for(var u:inst.def)
                for(var v:live) {
                    AddEdge(u, v);
                    AddEdge(v, u);
                }
            for(var v: inst.def) if(live.contains(v))live.remove(v);
            for(var v: inst.use) live.add(v);
        }
    }

    public void Build() {
        for(var block: curFunc.list)Build(block);
        Build(curFunc.RetBlock);
    }


    ArrayList<ASMMvInst> NodeMoves(ASMReg x) {
        ArrayList<ASMMvInst> ret = new ArrayList<>();
        for(var v: moveList.get(x))
            if(activeMoves.contains(v) || worklistMoves.contains(v))
                ret.add(v);
        return ret;
    }

    boolean MoveRelated(ASMReg x) {
        return NodeMoves(x).size() > 0;
    }

    void MakeWorklist() {
         for(var reg:initial) {
            if(deg.get(reg) >= K) {
                spillWorkList.add(reg);
            }else if(MoveRelated(reg)) {
                freezeWorklist.add(reg);
            }else {
                simplifyWorklist.add(reg);
            }
         }
    }

    HashSet<ASMReg> Adjacent(ASMReg v) {
        HashSet<ASMReg> ret = new HashSet<>();
        for(var val: adjList.get(v)) ret.add(val);
        for(var val: selectStack) if(ret.contains(val)) ret.remove(val);
        for(var val: coalescedNodes) if(ret.contains(val)) ret.remove(val);
        return ret;
    }

    void DecrementDegree(ASMReg rt) {
        deg.replace(rt,deg.get(rt)-1);
        if(deg.get(rt) == K) {
            HashSet<ASMReg> T = new HashSet<>();
            T.add(rt);
            var tmpT = Adjacent(rt);
            for(var v: tmpT) T.add(v);
            EnableMoves(T);

            spillWorkList.remove(rt);

            if(MoveRelated(rt)) freezeWorklist.add(rt);
            else simplifyWorklist.add(rt);
        }
    }

    void EnableMoves(HashSet<ASMReg> nodes) {
        for(var v:nodes) {
            var T = NodeMoves(v);
            for(var u: T) if(activeMoves.contains(u)) {
                activeMoves.remove(u);
                worklistMoves.add(u);
            }
        }
    }

    void EnableMoves(ASMReg v) {
        var T = NodeMoves(v);
        for(var u: T) if(activeMoves.contains(u)) {
            activeMoves.remove(u);
            worklistMoves.add(u);
        }
    }

    public void Simplify() {
        ASMReg x = simplifyWorklist.getFirst();
        simplifyWorklist.removeFirst();
        selectStack.push(x);
        var T = Adjacent(x);
        for(var v: T) DecrementDegree(v);
    }

    void AddWorkList(ASMReg v) {
        if(!precolored.contains(v) && !MoveRelated(v) && deg.get(v) < K) {
            freezeWorklist.remove(v);
            simplifyWorklist.add(v);
        }
    }

    boolean OK(ASMReg u,ASMReg v) {
        return deg.get(u) < K || precolored.contains(u) || adjSet.contains(new Pair<>(u,v));
    }

    boolean Conservative(HashSet<ASMReg> node) {
        int k = 0;
        for(var v:node)
            if(deg.get(v) >= K) k++;
        return k < K;
    }

    boolean Conservative(ASMReg x,ASMReg y) {
        HashSet<ASMReg> ret = new HashSet<>();
        var Set = Adjacent(x);
        for(var v:Set) ret.add(v);
        Set = Adjacent(y);
        for(var v:Set) ret.add(v);
        return Conservative(ret);
    }

    ASMReg GetAlias(ASMReg x) {
        if(coalescedNodes.contains(x))
            return alias.replace(x,GetAlias(alias.get(x)));
        else return x;
    }

    void Combine(ASMReg u,ASMReg v) {//v->u
        if(freezeWorklist.contains(v)) freezeWorklist.remove(v);
        else spillWorkList.remove(v);
        coalescedNodes.add(v);
        alias.put(v,u);
        for(var tmp:moveList.get(v))moveList.get(u).add(tmp);
        EnableMoves(v);
        var AdjSet = Adjacent(v);
        for(var tmp: AdjSet) {
            AddEdge(tmp, u);
            AddEdge(u, tmp);
            DecrementDegree(tmp);//?
        }
        if(deg.get(u) >= K && freezeWorklist.contains(u)) {
            freezeWorklist.remove(u);
            spillWorkList.add(u);
        }
    }

    boolean check(ASMReg v,ASMReg u) {
        var AdjSet = Adjacent(v);
        for(var tmp: AdjSet)
            if(!OK(tmp,u)) return false;
        return true;
    }

    boolean check_a(ASMReg reg) {
        if(!(reg instanceof PhyReg))return false;
        if(reg.toString().charAt(0) == 'a')return true;
        else return false;
    }

    public void Coalesce() {
        var m = worklistMoves.getFirst();
        var x = GetAlias(m.rd);
        var y = GetAlias(m.rs1);
        ASMReg u,v;
        if(precolored.contains(y)) {
            u = y; v = x;
        }else {u = x; v = y;}
        worklistMoves.remove(m);
        if(u == v) {
            coalescedMoves.add(m);
            AddWorkList(u);
        }else if(precolored.contains(v) || adjSet.contains(new Pair<>(u,v))) {
            constrainedMoves.add(m);
            AddWorkList(u);
            AddWorkList(v);
        }else if( ((precolored.contains(u) && check(v,u)) || (!precolored.contains(u)&&Conservative(u,v))) && !check_a(u) ) {
            coalescedMoves.add(m);
            Combine(u,v);
            AddWorkList(u);
        }else activeMoves.add(m);
    }

    void FreezeMoves(ASMReg u) {
        var Set =  NodeMoves(u);
        for(var mv:Set) {
            ASMReg v;
            if(GetAlias(mv.rs1) == GetAlias(u)) v = GetAlias(mv.rd);
            else v = GetAlias(mv.rs1);
            activeMoves.remove(mv);
            frozenMoves.add(mv);
            if(NodeMoves(v).size()==0 && deg.get(v) < K) {
                freezeWorklist.remove(v);
                simplifyWorklist.add(v);
            }
        }
    }

    public void Freeze() {
        var v = freezeWorklist.getFirst();
        freezeWorklist.removeFirst();
        simplifyWorklist.add(v);
        FreezeMoves(v);
    }

    public void SelectSpill() {
        ASMReg v = null;
        int mxdeg = -233;
        for(var tmp: spillWorkList)
            if(deg.get(tmp) > mxdeg)
                mxdeg = deg.get(v = tmp);
        spillWorkList.remove(v);
        simplifyWorklist.add(v);
        FreezeMoves(v);
    }

    void AssignColors() {
        curFunc.MaxUsed = -1;
        while(!selectStack.empty()) {
            ASMReg now = selectStack.peek();
            selectStack.pop();
            HashSet<Integer> UsedColor = new HashSet<>();
            for(var v: adjList.get(now)) {
                var u = GetAlias(v);
                if (precolored.contains(u) || colored.contains(u))
                    UsedColor.add(color.get(u));
            }
            int stcolor = 0;
            while(UsedColor.contains(stcolor))stcolor++;
            if(stcolor == K) {
                spilledNodes.add(now);
            }else {
                colored.add(now);
                color.put(now,stcolor);
                curFunc.MaxUsed = Math.max(curFunc.MaxUsed,stcolor);
            }
        }
        for(var v:coalescedNodes) {
            color.replace(v, color.get(GetAlias(v)));
        }
    }

    HashMap<ASMReg,VirReg> NewVirReg = new HashMap<>();

    ASMReg ReplaceReg(ASMReg reg) {
        if(reg == null)return null;
        reg = GetAlias(reg);
        if(reg instanceof PhyReg) return reg;
//        reg = curFunc.get_VirReg(((VirReg)reg).index);
        if(colored.contains(reg)) return asmModule.pos.get("s" + color.get(reg));
        else if(spilledNodes.contains(reg)) return NewVirReg.get(reg);
        else System.out.println(reg);
        return null;
    }

    void ReplaceBlock(ASMBlock block) {
        for(var inst:block.list) {
            inst.rs1 = ReplaceReg(inst.rs1);
            inst.rs2 = ReplaceReg(inst.rs2);
            inst.rd = ReplaceReg(inst.rd);
        }
    }

    void RewriteProgram(HashSet<ASMReg> nodes) {//modified
        NewVirReg.clear();
        curFunc.usedVirReg = 2 + curFunc.MaxUsed;
        for(var v:nodes) NewVirReg.put(v,new VirReg(curFunc.usedVirReg++));
        for(var b:curFunc.list) ReplaceBlock(b);
        ReplaceBlock(curFunc.RetBlock);

//        for(int i=1;i<curFunc.allocReg;i++) {
//            var v = curFunc.get_VirReg(i);
//            for(var u: adjList.get(v))
//                if(ReplaceReg(u)==ReplaceReg(v))
//                    System.out.println("??");
//        }
    }

    public void Main() {
        new LivenessAnalysis(curFunc);
        init();
        Build();
        MakeWorklist();
        while(true) {
            if(simplifyWorklist.size() > 0) Simplify();
            else if(worklistMoves.size() > 0) Coalesce();
            else if(freezeWorklist.size() > 0) Freeze();
            else if(spillWorkList.size() > 0) SelectSpill();
            else break;
        }
        AssignColors();
//        if(spilledNodes.size() > 0) {
            RewriteProgram(spilledNodes);
//            Main();
//        }
    }


}
