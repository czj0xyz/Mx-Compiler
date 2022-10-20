package Util;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;
public class Position {
    public int x,y;
    public Position() {
        x=y=0;
    }
    public Position(int a,int b) {
        x=a;y=b;
    }

    public Position(Token token) {
        this.x = token.getLine();
        this.y = token.getCharPositionInLine();
    }

    public Position(TerminalNode terminal) {
        this(terminal.getSymbol());
    }

    public Position(ParserRuleContext ctx) {
        this(ctx.getStart());
    }

    public String toString() {
        return ": "+ x+ " " +y;
    }

}
