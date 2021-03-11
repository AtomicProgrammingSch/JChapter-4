package com.atomicprogramming.JChapter4;

import java.util.Scanner;

public class Task9 {

    public static double powerValue(double number, double exponent) {
        return Math.pow(number, exponent);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = 0;
        double exponent = 0;
        System.out.println("Please enter your number:");
        if (scanner.hasNextDouble()) {
            number = scanner.nextDouble();
        }
        System.out.println("Please enter your exponent:");
        if (scanner.hasNextDouble()) {
            exponent = scanner.nextDouble();
        }
        double result = powerValue(number, exponent);
        System.out.println(number + " to the power of " + exponent + " is " + result);
        scanner.close();
    }
}
