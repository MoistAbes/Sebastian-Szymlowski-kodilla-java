package com.kodilla.exception.test;

public class ExceptionHandling {
    public String handleSecondChallangeException(){
        SecondChallange secondChallange = new SecondChallange();

        try {
            return secondChallange.probablyIWillThrowException(5, 2);
        } catch (Exception e) {
            return  "Something went wrong! Error: " + e;
        }finally {
            System.out.println("Finally is always here");
        }
    }
}
