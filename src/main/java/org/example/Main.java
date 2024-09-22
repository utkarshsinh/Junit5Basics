package org.example;

public class Main {
    //    test<System Under Test> _ Condition or State Change>_<Expected Result>
    public static void main(String[] args) {
        System.out.println("Hello Maven world!");
    }

    public int integerDivision(int dividend, int divisor){
        return dividend/divisor;
    }
    public int integerSubtraction(int minuend, int subtrahend){
        return minuend - subtrahend;
    }
}