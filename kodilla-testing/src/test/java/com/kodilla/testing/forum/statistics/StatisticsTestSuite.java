package com.kodilla.testing.forum.statistics;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class StatisticsTestSuite {

    private static int testCounter = 0;

    @Mock
    Statistics statisticsMock;

    @BeforeEach
    void beforeEveryTest(){
        testCounter++;
        System.out.println("Beginning to execute test #" + testCounter);

        //Setting up data
        List<String> resultListOfUsers = generateListOfNUsers(500);
        int resultPostsCount = 500;
        int resultCommentsCount = 500;

        when(statisticsMock.usersNames()).thenReturn(resultListOfUsers);
        when(statisticsMock.postsCount()).thenReturn(resultPostsCount);
        when(statisticsMock.commentsCount()).thenReturn(resultCommentsCount);
    }


    @Test
    void testCalculateAdvStatisticsPosts0(){

        //Given
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        int resultPostCount = 0;
        when(statisticsMock.postsCount()).thenReturn(resultPostCount);


        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);


        //Then
        Assertions.assertEquals(0, statisticsCalculator.getAveragePostsPerUser());
        Assertions.assertEquals(0, statisticsCalculator.getAverageCommentsPerPost());
        Assertions.assertEquals(0,statisticsCalculator.getAverageCommentsPerUser());

    }

    @Test
    void testCalculateAdvStatisticsPosts1000(){

        //Given
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        int resultPostsCount = 1000;

        when(statisticsMock.postsCount()).thenReturn(resultPostsCount);

        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);


        //Then
        Assertions.assertEquals(2.0, statisticsCalculator.getAveragePostsPerUser());
        Assertions.assertEquals(0.5, statisticsCalculator.getAverageCommentsPerPost());
        Assertions.assertEquals(1.0,statisticsCalculator.getAverageCommentsPerUser());

    }

    @Test
    void testCalculateAdvStatisticsComments0(){

        //Given
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        int resultCommentsCount = 0;

        when(statisticsMock.commentsCount()).thenReturn(resultCommentsCount);

        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);


        //Then
        Assertions.assertEquals(1.0, statisticsCalculator.getAveragePostsPerUser());
        Assertions.assertEquals(0, statisticsCalculator.getAverageCommentsPerPost());
        Assertions.assertEquals(0,statisticsCalculator.getAverageCommentsPerUser());

    }

    @Test
    void testCalculateAdvStatisticsLessCommentsThanPosts(){

        //Given
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        int resultCommentsCount = 250;

        when(statisticsMock.commentsCount()).thenReturn(resultCommentsCount);

        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);


        //Then
        Assertions.assertEquals(1.0, statisticsCalculator.getAveragePostsPerUser());
        Assertions.assertEquals(0.5, statisticsCalculator.getAverageCommentsPerPost());
        Assertions.assertEquals(0.5,statisticsCalculator.getAverageCommentsPerUser());

    }

    @Test
    void testCalculateAdvStatisticsMoreCommentsThanPosts(){

        //Given
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        int resultCommentsCount = 750;

        when(statisticsMock.commentsCount()).thenReturn(resultCommentsCount);

        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);


        //Then
        Assertions.assertEquals(1.0, statisticsCalculator.getAveragePostsPerUser());
        Assertions.assertEquals(1.5, statisticsCalculator.getAverageCommentsPerPost());
        Assertions.assertEquals(1.5,statisticsCalculator.getAverageCommentsPerUser());

    }

    @Test
    void testCalculateAdvStatisticsUsers0(){

        //Given
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        List<String> resultListOfUsers = generateListOfNUsers(0);

        when(statisticsMock.usersNames()).thenReturn(resultListOfUsers);


        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);


        //Then
        Assertions.assertEquals(0, statisticsCalculator.getAveragePostsPerUser());
        Assertions.assertEquals(1.0, statisticsCalculator.getAverageCommentsPerPost());
        Assertions.assertEquals(0,statisticsCalculator.getAverageCommentsPerUser());

    }

    @Test
    void testCalculateAdvStatisticsUsers100(){

        //Given
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        List<String> resultListOfUsers = generateListOfNUsers(100);

        when(statisticsMock.usersNames()).thenReturn(resultListOfUsers);


        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);


        //Then
        Assertions.assertEquals(5.0, statisticsCalculator.getAveragePostsPerUser());
        Assertions.assertEquals(1.0, statisticsCalculator.getAverageCommentsPerPost());
        Assertions.assertEquals(5.0,statisticsCalculator.getAverageCommentsPerUser());

    }





    public List<String> generateListOfNUsers(int usersQuantity){
        List<String> resultList = new ArrayList<>();

        for (int n = 0; n < usersQuantity; n++){
            resultList.add("User " + n);
        }

        return resultList;
    }

}
