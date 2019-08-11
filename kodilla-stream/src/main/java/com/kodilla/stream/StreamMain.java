package com.kodilla.stream;

import com.kodilla.stream.lambda.*;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {
    public static void main(String[] args){
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("calculating with lambdas");
        expressionExecutor.executeExpression(10,5, (a,b)->a+b);
        expressionExecutor.executeExpression(10,5, (a,b)->a-b);
        expressionExecutor.executeExpression(10,5, (a,b)->a*b);
        expressionExecutor.executeExpression(10,5, (a,b)->a/b);

        System.out.println("calculating with method references");
        expressionExecutor.executeExpression(3,4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3,4, FunctionalCalculator::addAByB);
        expressionExecutor.executeExpression(3,4, FunctionalCalculator::subAByB);
        expressionExecutor.executeExpression(3,4, FunctionalCalculator::divideAByB);
    }
}
