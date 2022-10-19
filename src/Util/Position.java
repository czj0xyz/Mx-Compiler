package Util;


public class Position {
    public int x,y;
    public Position() {
        x=y=0;
    }
    public Position(int a,int b) {
        x=a;y=b;
    }

    public String toString() {
        return x+ " " +y;
    }

}
