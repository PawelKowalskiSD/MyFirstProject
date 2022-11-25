package com.tasks;

public class Calculator {

    public int adding(int a, int b) {
        return a + b;
    }

    public int subtraction(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        int sumA = calculator.adding(2,5);
        int sumB = calculator.subtraction(30,12);

        System.out.println(sumA);
        System.out.println(sumB);
    }
}
