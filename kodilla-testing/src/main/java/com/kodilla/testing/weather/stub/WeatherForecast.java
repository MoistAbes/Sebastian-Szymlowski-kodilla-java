package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast(){
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature:
            temperatures.getTemperatures().entrySet()){

            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }

        return resultMap;
    }

    public Double calculateAverageTemperature(){
        Double result = 0.0;
        int temperaturesCount = 0;

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()){

            result += temperature.getValue();
            temperaturesCount++;
        }

        result /= temperaturesCount;

        return result;

    }

    public Double calculateMedianTemperature(){
        Double result = 0.0;
        List<Double> temperaturesList = new ArrayList<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()){

            temperaturesList.add(temperature.getValue());
        }

        Collections.sort(temperaturesList);

        if (temperaturesList.size() % 2 != 0){
            result = temperaturesList.get(temperaturesList.size() / 2);
        }else {
            result = temperaturesList.get((temperaturesList.size() / 2) - 1);
            result += temperaturesList.get(temperaturesList.size() / 2);
            result /= 2;
        }

        return result;

    }
}
