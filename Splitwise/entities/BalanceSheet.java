package entities;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class BalanceSheet {
    User owner;
    Map<User, Double> mp = new ConcurrentHashMap<>();

    public BalanceSheet(User owner) {
        this.owner = owner;
    }


    public Double getUserBalance(User user) {
        return this.mp.get(user);
    }

    public void updateBalanceWithUser(User user, Double am){
        if(owner == user){
            System.out.println("aobvoieaN");
            return;
        }
        this.mp.put(user, am+this.mp.get(user));
    }
    public void updateBalanceWithExpense(User paidBy, List<Split> participantSplit){

        for(Split sp: participantSplit){
            User user = sp.user;
            Double splitAmt = sp.amount;
            paidBy.getBalanceSheet().updateBalanceWithUser(user, splitAmt);
            user.getBalanceSheet().updateBalanceWithUser(paidBy, -1*splitAmt);
        }          
    }

   

}
