package entities;

import enums.Symbol;

public class Player {
    String name;
    Symbol symbol;
    Player(String name,Symbol sym) {
        this.name = name;
        this.symbol=sym;
    }
    public String getName(){
        return this.name;
    }
    public Symbol getSymbol(){
        return this.symbol;
    }
}