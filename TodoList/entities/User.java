package entities;

public class User {
    String name;

    public User(String name){
        this.name=name;

    }

    public String getName(){
        return this.name;

    }

    public void assignTask(Task t){
        t.assigned=this;
        // t.status=TaskStatus.INPROGRESS;
    }



}

