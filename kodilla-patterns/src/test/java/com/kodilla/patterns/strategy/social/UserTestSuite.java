package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserTestSuite {

    //15.3

    @Test
    void testDefaultSharingStrategies(){
        //Given
        User bobby = new Millenials("Bobby Mac");
        User randy = new ZGeneration("Randy Lorn");
        User gandy = new YGeneration("Gandy White");

        //When
        String whereBobbyShares = bobby.sharePost();
        String whereRandyShares = randy.sharePost();
        String whereGandyShares = gandy.sharePost();

        //Then
        Assertions.assertEquals("Facebook", whereBobbyShares);
        Assertions.assertEquals("Snapchat", whereRandyShares);
        Assertions.assertEquals("Twitter", whereGandyShares);
    }

    @Test
    void testIndividualSharingStrategy(){
        //Given
        User bobby = new Millenials("Bobby Mac");

        //When
        bobby.setSocialPublisher(new TwitterPublisher());
        String whereShouldBobbyShare = bobby.sharePost();


        //Then
        Assertions.assertEquals("Twitter", whereShouldBobbyShare);
    }
}
