package entities;
import java.util.*;
public class Group {
    String name;
    List<User>list;
    List<Expense> expenses;


    public Group(User user, ArrayList<User> grpList){
        this.list = grpList;
        this.expenses = new ArrayList<>();
    }

    public void addExpense(Expense expense){
        this.expenses.add(expense);
    }



    
}