package strategy;

import entities.Split;
import entities.User;
import java.util.List;

public interface Implementstrat {

    List<Split> split(List<User> users, Double amount, User paidBy,List<Double>list);
    
}