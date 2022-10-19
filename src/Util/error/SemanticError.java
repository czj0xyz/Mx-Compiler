package Util.error;

import Util.Position;

public class SemanticError extends error {

    public SemanticError(String msg, Position pos) {
        super("Semantic Error: " + msg, pos);
    }

}