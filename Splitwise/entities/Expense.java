package entities;

import java.util.List;
import strategy.Implementstrat;

public class Expense {

    String description;
    Double amount;
    List<Split> participantSplit;
    Implementstrat strategy;

    public void Expense(String desc,List<User> users, Double amount, User paidBy,List<Double>list, Implementstrat strategy){

        this.description=desc;
        this.amount=amount;
        this.strategy = strategy;
        this.participantSplit= strategy.split(users,amount,paidBy,list);
        
    }

}