//import utility.Error;
//import utility.MxErrorListener
import java.io.*;
import java.util.Scanner;

import Backend.IRbuilder;
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

            InputStream input = new FileInputStream(new File("E:\\sjtu\\编译器\\Rt\\" +
                                           "Mx-Compiler\\testcase\\tmp.mx"));
            MxCompilerLexer lexer = new MxCompilerLexer(CharStreams.fromStream(input));
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
            OutputStream out = new FileOutputStream("output.s");

            IRbuilder ir = new IRbuilder(Scp);
            ir.buildIR(ASTRoot);

        /*
            ASMModule asm = new InstSelector(ir).getASM();

            new RegAlloc(asm).regAlloc();

            new BuiltinFunctionASMPrinter("output.s");

            new ASMPrinter(asm,out).Print();
         */

        } catch (error er) {
            System.err.println(er.toString());
            throw new RuntimeException();
        }
    }
}