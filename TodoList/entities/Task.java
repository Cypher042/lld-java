package entities;
import enums.*;
import java.time.LocalDateTime;

public class Task {

    String title;
    String description;
    TaskStatus status;
    TaskPriority priority;
    LocalDateTime timestamp;
    LocalDateTime dueDate;
    User assigned;

    public Task(String title,String des,
    TaskPriority priority,
    LocalDateTime dueDate, User assigned){

        this.title=title;
        this.description=des;
        this.status=TaskStatus.NOT_STARTED;
        this.priority=priority;
        this.timestamp= LocalDateTime.now();
        this.dueDate=dueDate;
        this.assigned=assigned;
    }

    public void changeStatus(TaskStatus taskStatus){
        this.status=taskStatus;
    }

    public void changePriority(TaskPriority priority){
        this.priority=priority;
    }
    zzzzz

    
}
