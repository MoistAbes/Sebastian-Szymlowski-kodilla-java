package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Task{

    //15.4

    private String taskName;
    private String whatToBuy;
    private double quantity;
    private boolean isTaskDone;

    public ShoppingTask(String taskName, String whatToBuy, double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
        isTaskDone = false;
    }

    @Override
    public void executeTask() {
        System.out.println("Executing shopping task: " + taskName + " what to buy: " + whatToBuy + " quantity: " + quantity);
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
