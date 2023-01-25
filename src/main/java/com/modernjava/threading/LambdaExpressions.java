package com.modernjava.threading;

public class LambdaExpressions implements HelloWorldInterface{

    @Override
    public String sayhelloWorld() {
        return "Hello World";
    }

    public static void main(String[] args) {
        LambdaExpressions lambdaExpressions = new LambdaExpressions();
        System.out.println(lambdaExpressions.sayhelloWorld());
    }
}
