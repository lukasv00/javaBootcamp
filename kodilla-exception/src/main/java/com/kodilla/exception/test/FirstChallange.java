package com.kodilla.exception.test;

public class FirstChallange {

    public double divide(double a, double b){
        try{
           return a / b;
        }catch (ArithmeticException e){

        }finally {
            System.out.println("The result is: ");
        }
    return a / b;
    }


      /*  throws ArithmeticException {
        if(b == 0){
            throw new ArithmeticException();
        }
        return a / b;
    }*/

    public static void main(String[] args){

        FirstChallange firstChallange = new FirstChallange();
        double result = firstChallange.divide(3,0);

        System.out.println(result);
    }
}
