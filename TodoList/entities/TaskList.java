package entities;
import enums.TaskPriority;
import enums.TaskStatus;
import java.util.ArrayList;
import java.util.List;
public class TaskList {
    List<Task>list;
    public TaskList(){
        this.list=new ArrayList<>();

    }
    public void addTask(Task task){
        list.add(task);
    }

    public void listTask(){
        for(Task it:list){
            System.out.println(it.title);
        }
    }

    public void filter(TaskStatus st){
    
         for(Task it:list){
            if(it.status==st)
            System.out.println(it.title);
        }

    } 
    public void filter(TaskPriority st){
    
         for(Task it:list){
            if(it.priority==st)
            System.out.println(it.title);
        }

    }

    public void filter(User user){
    
         for(Task it:list){
            if(it.assigned==user)
            System.out.println(it.title);
        }

    }
    


}
