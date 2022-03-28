package com.kodilla.patterns.strategy.social;

public class YGeneration extends User{

    //15.3

    public YGeneration(String name) {
        super(name);
        this.socialPublisher = new TwitterPublisher();
    }
}
