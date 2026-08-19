package entities;

import enums.Symbol;

public class Cell {

    // int x;
    // int y;

    private Symbol symbol = Symbol.NONE;

    public Cell() {
        // this.symbol = symbol;
        // this.x=x;
        // this.y=y;
    }

    public Symbol getValue() {
        return this.symbol;
    }
    public void setValue(Symbol symbol) {
        this.symbol= symbol;
    }

    // public int getX(){
    //     return this.x;

    // }
    //  public int getY(){
    //     return this.y;

    // }
    
}