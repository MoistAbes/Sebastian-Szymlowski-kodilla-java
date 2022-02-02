package com.kodilla.exception.test;

public class FirstChallange {
    public double divide(double a, double b) throws ArithmeticException {
        if (b == 0){
            throw new ArithmeticException();
        }
        return a / b;
    }

    public static void main(String[] args) {
        FirstChallange firstChallange = new FirstChallange();

        try{
            double result = firstChallange.divide(3, 0);
            System.out.println(result);
        }catch (ArithmeticException e){
            System.out.println("Something went wrong! Error: " + e);
        }finally {
            System.out.println("I am here.... Allwayss");
        }


    }
}
