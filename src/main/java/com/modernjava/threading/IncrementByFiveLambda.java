package com.modernjava.threading;

public class IncrementByFiveLambda {
    public static void main(String[] args) {
        IncrementByFiveInterface incrementByFiveInterface = (a)-> a + 5;
        System.out.println(incrementByFiveInterface.incrementByFive(5));
    }
}
