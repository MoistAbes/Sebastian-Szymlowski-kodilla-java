package com.kodilla.patterns.strategy.social;

public class ZGeneration extends User{

    //15.3

    public ZGeneration(String name) {
        super(name);
        this.socialPublisher = new SnapchatPublisher();
    }
}
