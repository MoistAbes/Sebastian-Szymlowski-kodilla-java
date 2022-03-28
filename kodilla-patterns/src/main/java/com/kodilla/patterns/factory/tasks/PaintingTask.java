package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task{

    //15.4

    private String taskName;
    private String color;
    private String whatToPaint;
    private boolean isTaskDone;

    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
        isTaskDone = false;
    }

    @Override
    public void executeTask() {
        System.out.println("Executing painting task: " + taskName + " what color: " + color + " what to paint: " + whatToPaint);
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
