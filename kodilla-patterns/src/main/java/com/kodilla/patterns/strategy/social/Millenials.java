package com.kodilla.patterns.strategy.social;

public class Millenials extends User {

    //15.3

    public Millenials(String name) {
        super(name);
        this.socialPublisher = new FacebookPublisher();
    }
}
