package com.todolist.application.controllers.ListTodo;

public class ListTodoOutput {
 
    private int id;
    private String title;
    private boolean done;

    public ListTodoOutput(int id, String title, boolean done){
        this.id = id;
        this.title = title;
        this.done = done;  
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean getDone(){
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    @Override
    public String toString(){
        return id + " " + title + " " + done;
    }
}