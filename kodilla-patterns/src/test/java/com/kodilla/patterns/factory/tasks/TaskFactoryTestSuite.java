package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TaskFactoryTestSuite {

    @Test
    void testFactoryDrivingTask(){
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task drivingTask = factory.makeTask(TaskFactory.DRIVING);
        drivingTask.executeTask();

        //Then
        assertEquals("Taxi", drivingTask.getTaskName());
        assertTrue(drivingTask.isTaskExecuted());
    }
    @Test
    void testFactoryShoppingTask(){
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task shoppingTask = factory.makeTask(TaskFactory.SHOPPING);
        shoppingTask.executeTask();

        //Then
        assertEquals("Late night shopping", shoppingTask.getTaskName());
        assertTrue(shoppingTask.isTaskExecuted());
    }
    @Test
    void testFactoryPaintingTask(){
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task paintingTask = factory.makeTask(TaskFactory.PAINTING);
        paintingTask.executeTask();

        //Then
        assertEquals("Painting walls", paintingTask.getTaskName());
        assertTrue(paintingTask.isTaskExecuted());
    }

}
