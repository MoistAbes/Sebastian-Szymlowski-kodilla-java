package com.kodilla.patterns.strategy.social;

public class TwitterPublisher implements SocialPublisher{

    //15.3

    @Override
    public String share() {
        System.out.println("Twitter");
        return "Twitter";
    }
}
