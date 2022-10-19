//import utility.Error;
//import utility.MxErrorListener;
import java.io.FileInputStream;
import java.io.InputStream;
import grammar.*;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import Util.error.*;

public class Compiler
{
    public static void main(String[] args) throws Exception{
        System.out.println("Hello World");
        String name = "data.mx";
        InputStream input = new FileInputStream(name);
        try {

//            MxCompilerLexer lexer = new MxCompilerLexer(CharStreams.fromStream(input));
//            lexer.removeErrorListeners();
//            lexer.addErrorListener(new YxErrorListener());
//            MxCompilerParser parser = new MxCompilerParser(new CommonTokenStream(lexer));
//            parser.removeErrorListeners();
//            parser.addErrorListener(new YxErrorListener());
//            ParseTree parseTreeRoot = parser.program();
//            ASTBuilder astBuilder = new ASTBuilder(gScope);
//            ASTRoot = (RootNode)astBuilder.visit(parseTreeRoot);
//            new SymbolCollector(gScope).visit(ASTRoot);
//            new SemanticChecker(gScope).visit(ASTRoot);
        } catch (error er) {
            System.err.println(er.toString());
            throw new RuntimeException();
        }
    }
}