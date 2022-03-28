package com.kodilla.patterns.factory.tasks;

public class TaskFactory {

    //15.4

    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task makeTask(final String taskClass){
        switch (taskClass){
            case SHOPPING:
                return new ShoppingTask("Late night shopping", "food", 10.0);
            case PAINTING:
                return new PaintingTask("Painting walls", "Red", "Living room walls");
            case DRIVING:
                return new DrivingTask("Taxi","Texas","car");
            default:
                return null;
        }
    }

}
