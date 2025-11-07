package com.sgtesting;

class Calculator {
    int addition(int a, int b) {
        return a + b;
    }

    int addition(int a, int b, int c) {
        return a + b + c;
    }

    double addition(double a, double b) {
        return a + b;  // fixed to perform addition
    }
}

public class Abstract{
    public static void main(String[] args) {
        Calculator n = new Calculator();

        System.out.println("Addition of 2 ints: " + n.addition(22, 1));
        System.out.println("Addition of 3 ints: " + n.addition(1, 2, 3));
        System.out.println("Addition of 2 doubles: " + n.addition(12.5, 7.5));
    }
}
