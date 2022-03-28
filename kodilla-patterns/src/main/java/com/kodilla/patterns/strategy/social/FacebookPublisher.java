package com.kodilla.patterns.strategy.social;

public class FacebookPublisher implements SocialPublisher{

    //15.3

    @Override
    public String share() {
        System.out.println("Facebook");
        return "Facebook";
    }
}
