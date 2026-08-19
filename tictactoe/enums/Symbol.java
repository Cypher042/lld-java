package enums;

public enum Symbol {
    X('X'),O('O'),NONE('N');
    
    private final char value;
    
    Symbol(char value) {
        this.value = value;
    }
    
    public char getValue() {
        return value;
    }
}