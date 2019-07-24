package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

import java.sql.SQLOutput;

public class TestingMain {
    public static void main(String[] args){
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if(result.equals("theForumUser")) {
            System.out.println("test OK");
        }else{
            System.out.println("Error!");
        }

        System.out.println("Test - calculator sample");

        Calculator calculator = new Calculator();

        int resultAdd = calculator.add(123,31);

        if(resultAdd == 154){
            System.out.println("OK");
        }else{
            System.out.println("ERROR");
        }

        int resultSubstraction = calculator.substraction(213,11);

        if(resultSubstraction == 202){
            System.out.println("OK");
        }else{
            System.out.println("ERROR");
        }
    }
}
