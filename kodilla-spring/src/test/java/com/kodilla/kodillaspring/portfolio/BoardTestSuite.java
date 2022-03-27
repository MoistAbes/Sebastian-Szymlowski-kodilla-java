package com.kodilla.kodillaspring.portfolio;

import com.kodilla.kodillaspring.reader.ReaderConfig;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;
import java.util.List;

@SpringBootTest
public class BoardTestSuite {

    @Test
    void testToDoList(){
        //Given
        //ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.kodillaspring");
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //When
        List<String> resultToDoList = board.getToDoList().getTasks();
        List<String> resultInProgressList = board.getInProgressList().getTasks();
        List<String> resultDoneList = board.getDoneList().getTasks();



        //Then
        Assertions.assertTrue(resultToDoList.isEmpty());
        Assertions.assertTrue(resultInProgressList.isEmpty());
        Assertions.assertTrue(resultDoneList.isEmpty());


    }

    @Test
    void testTaskAdd(){
        //Given
        //ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.kodillaspring");
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);


        //When
        String resultToDoTask = "Clean my room";
        String resultInProgressTask = "Eat breakfast";
        String resultDoneTask = "Wash my teeth";

        board.addToDoTask(resultToDoTask);
        board.addInProgressTask(resultInProgressTask);
        board.addDoneTask(resultDoneTask);


        //Then
        Assertions.assertEquals(resultToDoTask, board.getToDoList().getTasks().get(0));
        Assertions.assertEquals(resultInProgressTask, board.getInProgressList().getTasks().get(0));
        Assertions.assertEquals(resultDoneTask, board.getDoneList().getTasks().get(0));


    }

}
