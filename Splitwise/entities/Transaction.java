package entities;
public class Transaction {
    User payer;
    User paid;

    Double amount;

    public Transaction(User payUser, User paid, User, Double amount){
        this.payer=payUser;
        this.paid=paid;
        this.amount=amount;

        
    }
}
