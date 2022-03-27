package com.kodilla.kodillaspring.calculator;

import org.springframework.stereotype.Component;

//14.2

@Component
public class Display {

    public void displayValue(double val){
        System.out.println(val);
    }

}
