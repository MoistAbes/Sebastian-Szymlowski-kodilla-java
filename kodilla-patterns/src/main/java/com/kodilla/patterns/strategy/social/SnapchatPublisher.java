package com.kodilla.patterns.strategy.social;

public class SnapchatPublisher implements SocialPublisher{

    //15.3

    @Override
    public String share() {
        System.out.println("Snapchat");
        return "Snapchat";
    }
}
