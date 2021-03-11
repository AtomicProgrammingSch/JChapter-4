package com.atomicprogramming.JChapter4;

import java.util.Scanner;

public class Task3Alternative {

    public static final double pi = Math.PI;

    public static double areaOfCircle(double radius) {
        return pi * Math.pow(radius, 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the radius of the circle:");
        double radius = 0;
        if (scanner.hasNextDouble()) {
            radius = scanner.nextDouble();
        }
        else {
            System.out.println("You can not enter a string!");
            System.exit(1);
        }
        double area = areaOfCircle(radius);
        System.out.println("The area of the circle is: " + area);
    }
}
