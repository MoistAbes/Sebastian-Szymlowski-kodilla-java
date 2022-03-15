package com.kodilla.kodillaspring;

import com.kodilla.kodillaspring.shape.Circle;
import com.kodilla.kodillaspring.shape.Shape;
import com.kodilla.kodillaspring.shape.Square;
import com.kodilla.kodillaspring.shape.Triangle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class KodillaSpringApplicationTests {

    @Test
    void testShapeLoadedIntoContainer() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.kodillaspring");
        Shape shape = (Shape)context.getBean("chosenShape");

        //When
        String name = shape.getShapeName();

        //Then
        System.out.println("Chosen shape says: " + name);
    }


    @Test
    void testSquareLoadedIntoContainer2(){
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.kodillaspring");
        //mozemy tez metoda getBean wyszukac po nazwie beana w kontenerze
        //w tym przypadku nasz obiekt square ma nazwe metody ktora go stworzyla
        Shape shape = (Shape) context.getBean("createSquare");

        //When
        String name = shape.getShapeName();

        //Then
        assertEquals("This is a square.", name);

    }

    @Test
    void testSquareLoadedIntoContainer(){
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.kodillaspring");
        Shape shape = context.getBean(Square.class);

        //When
        String name = shape.getShapeName();

        //Then
        assertEquals("This is a square.", shape.getShapeName());
    }

    @Test
    void testCircleLoadedIntoContainer(){
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.kodillaspring");
        Shape shape = context.getBean(Circle.class);

        //When
        String name = shape.getShapeName();

        //Then
        assertEquals("This is circle.", name);
    }


    @Test
    void testTriangleLoadedIntoContainer(){
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.kodillaspring");
        Shape shape = context.getBean(Triangle.class);

        //When
        String name = shape.getShapeName();

        //Then
        assertEquals("This is a triangle.", name);
    }

    @Test
    void contextLoads() {

    }

}
