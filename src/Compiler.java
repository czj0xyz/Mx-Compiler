//import utility.Error;
//import utility.MxErrorListener
import java.io.FileInputStream;
import java.io.File;
import java.io.InputStream;
import java.util.Scanner;

import Util.Scope.GlobalScope;
import ast.ProgramNode;
import grammar.*;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import Util.*;
import Util.error.*;
import Frontend.*;


public class Compiler
{
    public static void main(String[] args) throws Exception{
        try {
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

            System.out.println("Semantic Success!");
        } catch (error er) {
            System.err.println(er.toString());
            throw new RuntimeException();
        }
    }
}