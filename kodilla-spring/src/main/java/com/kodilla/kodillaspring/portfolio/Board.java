package com.kodilla.kodillaspring.portfolio;

import org.springframework.stereotype.Component;


public class Board {

    private TaskList toDoList;
    private TaskList inProgressList;
    private TaskList doneList;


    public Board(TaskList toDoList, TaskList inProgressList, TaskList doneList) {
        this.toDoList = toDoList;
        this.inProgressList = inProgressList;
        this.doneList = doneList;
    }

    public TaskList getToDoList() {
        return toDoList;
    }

    public TaskList getInProgressList() {
        return inProgressList;
    }

    public TaskList getDoneList() {
        return doneList;
    }

    public void addToDoTask(String task){
        toDoList.addTask(task);
    }
    public void addInProgressTask(String task){
        inProgressList.addTask(task);
    }
    public void addDoneTask(String task){
        doneList.addTask(task);
    }
}
