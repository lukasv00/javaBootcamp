package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main(String[] args) {

        SecondChallenge secondChallenge = new SecondChallenge();

        try{
            secondChallenge.probablyIWillThrowException(1.2,1.5);
        }catch (Exception e){
            System.out.println("nope");
        }finally {
            System.out.println("Always");
        }

    }
}
