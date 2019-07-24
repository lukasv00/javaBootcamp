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

        Calculator calculator = new Calculator(12, 41);

        int resultAdd = calculator.add();

        if(resultAdd == calculator.getA() + calculator.getB()){
            System.out.println("OK");
        }else{
            System.out.println("ERROR");
        }

        int resultSubstraction = calculator.substraction();

        if(resultSubstraction == calculator.getA() - calculator.getB()){
            System.out.println("OK");
        }else{
            System.out.println("ERROR");
        }
    }
}
