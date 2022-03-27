package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoggerTestSuite {


    //15.1

    @Test
    void testLastLog(){
        //Given
        Logger logger = Logger.INSTANCE;
        logger.log("witam");

        //When
        String resultLog = logger.getLastLog();
        System.out.println("Last log: " + resultLog);

        //Then
        Assertions.assertEquals("witam", logger.getLastLog());
    }

}
