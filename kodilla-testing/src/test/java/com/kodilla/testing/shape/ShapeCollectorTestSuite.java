package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;

@DisplayName("TDD: ShapeCollector Test Suite")
public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests(){
        System.out.println("This is the beginning of all tests.");
    }

    @AfterAll
    public static void afterAllTests(){
        System.out.println("All tests are finished.");
    }



    @BeforeEach
    public void beforeEveryTest(){
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }


    @Nested
    @DisplayName("Test Square")
    public class TestSquare{

        //Test sprawdzajacy czy figura pobrana z klasy ShapeCollector jest taka sama jak figura ktora była wstawiana do klasy
        @Test
        void testAddSquare(){

            //Given
            Shape square = new Square();
            ShapeCollector shapeCollector = new ShapeCollector();

            //When
            shapeCollector.addFigure(square);

            //Then
            Assertions.assertEquals(square, shapeCollector.getFigure(0));

        }

        //Test sprawdzajacy usuwanie Figury
        @Test
        void testRemoveSquare(){

            //Given
            Shape square = new Square();
            ShapeCollector shapeCollector = new ShapeCollector();
            shapeCollector.addFigure(square);

            //When
            boolean result = shapeCollector.removeFigure(square);

            //Then
            Assertions.assertTrue(result);
        }

        //Test sprawdzajacy czy kwadrat pobrany z klasy ShapeCollector jest taki sam jak kwadrat, który był wstawiany do klasy
        @Test
        void testGetSquare(){

            //Given
            Shape square = new Square();
            ShapeCollector shapeCollector = new ShapeCollector();
            shapeCollector.addFigure(square);

            //When
            Shape retrievedSquare = shapeCollector.getFigure(0);

            //Then
            Assertions.assertEquals(square, retrievedSquare);
        }

    }

    @Nested
    @DisplayName("Tests for Circle")
    public class TestCircle{

        //Test sprawdzajacy czy figura pobrana z klasy ShapeCollector jest taka sama jak figura ktora była wstawiana do klasy
        @Test
        void testAddCircle(){

            //Given
            Shape circle = new Circle();
            ShapeCollector shapeCollector = new ShapeCollector();

            //When
            shapeCollector.addFigure(circle);

            //Then
            Assertions.assertEquals(circle, shapeCollector.getFigure(0));

        }

        //Test sprawdzajacy usuwanie Figury
        @Test
        void testRemoveCircle(){

            //Given
            Shape circle = new Circle();
            ShapeCollector shapeCollector = new ShapeCollector();
            shapeCollector.addFigure(circle);

            //When
            boolean result = shapeCollector.removeFigure(circle);


            //Then
            Assertions.assertTrue(result);
        }

        //Test sprawdzajacy czy kwadrat pobrany z klasy ShapeCollector jest taki sam jak kwadrat, który był wstawiany do klasy
        @Test
        void testGetCircle(){

            //Given
            Shape circle = new Circle();
            ShapeCollector shapeCollector = new ShapeCollector();
            shapeCollector.addFigure(circle);

            //When
            Shape retrievedCircle = shapeCollector.getFigure(0);

            //Then
            Assertions.assertEquals(circle, retrievedCircle);
        }

    }

    @Nested
    @DisplayName("Tests for Triangle")
    public class TestTriangle{

        //Test sprawdzajacy czy figura pobrana z klasy ShapeCollector jest taka sama jak figura ktora była wstawiana do klasy
        @Test
        void testAddTriangle(){

            //Given
            Shape triangle = new Triangle();
            ShapeCollector shapeCollector = new ShapeCollector();

            //When
            shapeCollector.addFigure(triangle);

            //Then
            Assertions.assertEquals(triangle, shapeCollector.getFigure(0));

        }

        //Test sprawdzajacy usuwanie Figury
        @Test
        void testRemoveTriangle(){

            //Given
            Shape triangle = new Triangle();
            ShapeCollector shapeCollector = new ShapeCollector();
            shapeCollector.addFigure(triangle);

            //When
            boolean result = shapeCollector.removeFigure(triangle);


            //Then
            Assertions.assertTrue(result);
        }

        //Test sprawdzajacy czy kwadrat pobrany z klasy ShapeCollector jest taki sam jak kwadrat, który był wstawiany do klasy
        @Test
        void testGetTriangle(){

            //Given
            Shape triangle = new Triangle();
            ShapeCollector shapeCollector = new ShapeCollector();
            shapeCollector.addFigure(triangle);

            //When
            Shape retrievedTriangle = shapeCollector.getFigure(0);

            //Then
            Assertions.assertEquals(triangle, retrievedTriangle);
        }

    }

    @Nested
    @DisplayName("Tests for all figures")
    public class TestFigures{

        //Test sprawdzajacy czy pobrane figury z klasy ShapeCollector będą miały takie same nazwy jak te wstawiane do klasy
        @Test
        void testShowFigures(){

            //Given
            Shape square = new Square();
            Shape triangle = new Triangle();
            Shape circle = new Circle();

            ShapeCollector shapeCollector = new ShapeCollector();

            shapeCollector.addFigure(square);
            shapeCollector.addFigure(triangle);
            shapeCollector.addFigure(circle);

            //When
            String retrievedString = shapeCollector.showFigures();

            //Then
            Assertions.assertEquals(square.getShapeName() + triangle.getShapeName() + circle.getShapeName(), retrievedString);


        }

    }



}

