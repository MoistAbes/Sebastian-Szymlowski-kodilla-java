package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Task{

    //15.4

    private String taskName;
    private String where;
    private String using;
    private boolean isTaskDone;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
        isTaskDone = false;
    }

    @Override
    public void executeTask() {
        System.out.println("Executing driving task: " + taskName + " where: " + where + " using: " + using);
        isTaskDone = true;

    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return isTaskDone;
    }
}
