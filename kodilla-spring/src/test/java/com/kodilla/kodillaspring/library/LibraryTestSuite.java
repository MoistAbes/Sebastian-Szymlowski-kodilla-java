package com.kodilla.kodillaspring.library;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

@SpringBootTest
public class LibraryTestSuite {

    @Autowired
    private Library library;

    @Test
    void testContext(){
        //
        /*
        ApplicationContext context =
                new AnnotationConfigApplicationContext(LibraryConfig.class);

         */

        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.kodillaspring");


        //When and then
        System.out.println("====== BEAN LIST ======");
        Arrays.stream(context.getBeanDefinitionNames())
                .forEach(System.out::println);
        System.out.println("====== BEANS LIST ======");
    }

    //Krotsza wersja dzieki uzyciu autowired powyzej
    @Test
    public void testLoadFromDbShort(){
        //Given

        //When
        library.loadFromDb();

        //Then
        //do nothing
    }

    @Test
    public void testSaveToDbShort() {
        //Given
        //When
        library.saveToDb();
        //Then
        //do nothing
    }


    @Test
    void  testLoadFromDb(){
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.kodillaspring");
        Library library = context.getBean(Library.class);

        //When
        library.loadFromDb();

        //Then
        //do nothing
    }

    @Test
    void testSaveToDb(){
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.kodillaspring");
        Library library = context.getBean(Library.class);

        //When
        library.saveToDb();

        //Then
        //do nothing

    }


}
