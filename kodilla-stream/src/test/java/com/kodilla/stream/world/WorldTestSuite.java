package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldTestSuite {

    @Test
    void testGetPeopleQuantity(){
        //Given
        Country japan = new Country("Japan", new BigDecimal(1258000));
        Country china = new Country("China", new BigDecimal(14020000));
        Country indonesia = new Country("Indonesia", new BigDecimal(2735000));

        Continent asia = new Continent();
        asia.addCountry(japan);
        asia.addCountry(china);
        asia.addCountry(indonesia);

        Country russia = new Country("Russia", new BigDecimal(1441000));
        Country germany = new Country("Germany", new BigDecimal(8324000));
        Country france = new Country("France", new BigDecimal(6739000));

        Continent europe = new Continent();
        europe.addCountry(russia);
        europe.addCountry(germany);
        europe.addCountry(france);

        Country nigeria = new Country("Nigeria", new BigDecimal(20613900));
        Country ethiopia = new Country("Ethiopia", new BigDecimal(14496300));
        Country egypt = new Country("Egypt", new BigDecimal(102334404));

        Continent africa = new Continent();
        africa.addCountry(nigeria);
        africa.addCountry(ethiopia);
        africa.addCountry(egypt);

        World world = new World();
        world.addContinent(asia);
        world.addContinent(europe);
        world.addContinent(africa);

        //When
        BigDecimal peopleQuantity = world.getPeopleQuantity();

        //Then
        BigDecimal expectedPeopleQuantity = new BigDecimal("171961604");
        assertEquals(expectedPeopleQuantity, peopleQuantity);





    }

}
