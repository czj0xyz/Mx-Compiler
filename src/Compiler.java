//import utility.Error;
//import utility.MxErrorListener
import java.io.*;
import java.util.Scanner;

import ASM.ASMModule;
import Backend.IRPrinter;
import Backend.IRbuilder;
import Backend.InstSelector;
import Backend.RegAlloc;
import Util.Scope.GlobalScope;
import ast.ProgramNode;
import grammar.*;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import Util.*;
import Util.error.*;
import Frontend.*;
import utility.BuiltinFunctionASMPrinter;


public class Compiler
{
    public static void main(String[] args) throws Exception{
        try {
//            InputStream input = new FileInputStream(new File("E:\\sjtu\\Compiler\\Rt\\" +
//                    "Mx-Compiler\\testcase\\codegen\\t3.mx"));
            MxCompilerLexer lexer = new MxCompilerLexer(CharStreams.fromStream(System.in));
            lexer.removeErrorListeners();
            lexer.addErrorListener(new MxComilerErrorListener());
            MxCompilerParser parser = new MxCompilerParser(new CommonTokenStream(lexer));
            parser.removeErrorListeners();
            parser.addErrorListener(new MxComilerErrorListener());
            ParseTree parseTreeRoot = parser.program();

            ASTbuilder ast = new ASTbuilder();
            ProgramNode ASTRoot = (ProgramNode) ast.visit(parseTreeRoot);
            GlobalScope Scp = new GlobalScope(null);
            new SymbolCollector(Scp).visit(ASTRoot);
            new SemanticChecker(Scp).visit(ASTRoot);
//            System.out.println("Semantic Success!");

            //Codegen:
//            FileOutputStream ir_out = new FileOutputStream("output.ll");

            IRbuilder ir = new IRbuilder(Scp);
            var irModule =  ir.buildIR(ASTRoot);
//            ir_out.write( (new IRPrinter()).Print(irModule).getBytes() );

//            ir_out.close();

//            FileOutputStream asm_out = new FileOutputStream("./fortest/ravel/build/test.s");
            FileOutputStream asm_out_oj = new FileOutputStream("output.s");

            ASMModule asmModule = new ASMModule();

            new InstSelector(asmModule,irModule);
            new RegAlloc(asmModule);

//            asm_out.write( asmModule.toString().getBytes() );
//            asm_out.close();
            asm_out_oj.write( asmModule.toString().getBytes() );
            asm_out_oj.close();
            new BuiltinFunctionASMPrinter("builtin.s");
        } catch (error er) {
            System.err.println(er.toString());
            throw new RuntimeException();
        }
    }
}