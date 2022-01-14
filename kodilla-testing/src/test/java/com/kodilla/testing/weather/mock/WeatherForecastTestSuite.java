package com.kodilla.testing.weather.mock;

import com.kodilla.testing.weather.stub.Temperatures;
import com.kodilla.testing.weather.stub.WeatherForecast;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class WeatherForecastTestSuite {

    private static int testCounter = 0;

    @Mock
    private Temperatures temperaturesMock;

    @BeforeEach
    public void beforeEveryTest(){
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);

        Map<String, Double> temperaturesMap = new HashMap<>();    //14

        temperaturesMap.put("Rzeszow", 25.5);  //15
        temperaturesMap.put("Krakow", 26.2);   //16
        temperaturesMap.put("Wroclaw", 24.8);  //17
        temperaturesMap.put("Warszawa", 25.2); //18
        temperaturesMap.put("Gdansk", 26.1);   //19

        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
    }

    @Test
    void testCalculateForecastSuite(){
        //Given
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock); //21

        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();

        //Then
        Assertions.assertEquals(5, quantityOfSensors);
    }

    @Test
    void testCalculateAverageTemperature(){

        //Given
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        Double averageTemperature = weatherForecast.calculateAverageTemperature();

        //Then
        Assertions.assertEquals(25.56, averageTemperature);

    }

    @Test
    void testCalculateMedianTemperature(){
        //Given
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        Double medianTemperature = weatherForecast.calculateMedianTemperature();

        //Then
        Assertions.assertEquals(25.5, medianTemperature);
    }

}
