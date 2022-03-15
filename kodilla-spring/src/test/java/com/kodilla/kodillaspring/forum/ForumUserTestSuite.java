package com.kodilla.kodillaspring.forum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class ForumUserTestSuite {

    @Test
    void testGetUsername(){
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.kodillaspring");
        ForumUser forumUser = context.getBean(ForumUser.class);

        //When
        String name = forumUser.getUsername();

        //Then
        Assertions.assertEquals("John Smith", name);
    }
}
