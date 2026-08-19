package strategy;

import entities.Split;
import entities.User;
import java.util.*;

public class EqualSplit implements Implementstrat {
        @Override
        public List<Split> split(List<User> users, Double amount, User paidBy, List<Double> list) {
                ArrayList<Split> splits = new ArrayList<>();

                Double splitAmt = amount / users.size();
                for (int i = 0; i < users.size(); i++) {

                        splits.add(new Split(users.get(i), splitAmt));

                }
                return splits;

        }

}
