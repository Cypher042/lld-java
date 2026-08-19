package entities;

public class User {
    String name;
    BalanceSheet bs;
    public User(String name,BalanceSheet bs){

        this.name=name;
        this.bs=bs;

    }
    // public
        public BalanceSheet getBalanceSheet() {
        return this.bs;
    }
    


    



}
