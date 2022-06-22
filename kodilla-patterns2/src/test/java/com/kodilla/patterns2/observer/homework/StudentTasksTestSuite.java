package com.kodilla.patterns2.observer.homework;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentTasksTestSuite {

    @Test
    public void testUpdate(){
        // Given
        StudentTasks studentTasks1 = new StudentTasks("loops");
        StudentTasks studentTasks2 = new StudentTasks("Hibernate");
        StudentTasks studentTasks3 = new StudentTasks("Exceptions");

        Mentor mentor = new Mentor("mentor1");
        Mentor mentor2 = new Mentor("mentor2");

        studentTasks1.registerObserver(mentor);
        studentTasks2.registerObserver(mentor);
        studentTasks3.registerObserver(mentor2);


        // When
        studentTasks1.addTask("task1");
        studentTasks2.addTask("task1");
        studentTasks3.addTask("task1");
        studentTasks2.addTask("task2");
        studentTasks3.addTask("task2");
        // Then
        assertEquals(3, mentor.getUpdateCount());
        assertEquals(2, mentor2.getUpdateCount());
    }
}
