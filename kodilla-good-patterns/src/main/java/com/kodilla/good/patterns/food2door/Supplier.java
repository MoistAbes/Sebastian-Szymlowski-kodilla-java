package com.kodilla.good.patterns.food2door;

public class Supplier {
    private String name;
    private String info;


    public Supplier(String name, String info) {
        this.name = name;
        this.info = info;
    }

    public String getName() {
        return name;
    }

    public String getInfo() {
        return info;
    }
}
