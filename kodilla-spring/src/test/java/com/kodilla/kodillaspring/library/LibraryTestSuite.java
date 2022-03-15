package com.kodilla.kodillaspring.library;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class LibraryTestSuite {

    @Autowired
    private Library library;

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
