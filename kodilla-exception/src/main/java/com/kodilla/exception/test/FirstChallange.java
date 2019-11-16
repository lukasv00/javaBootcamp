package com.kodilla.exception.test;

public class FirstChallange {

    public double divide(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException();
        }
        return a / b;
    }


    public static void main(String[] args) {

        FirstChallange firstChallange = new FirstChallange();

        try {
            firstChallange.divide(3, 1);
        } catch (ArithmeticException e) {
            System.out.println("nope");
        } finally {
            System.out.println("Always");
        }
    }
}
