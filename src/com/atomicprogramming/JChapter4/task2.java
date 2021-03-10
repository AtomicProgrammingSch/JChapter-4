package com.atomicprogramming.JChapter4;

import java.util.Scanner;

public class task2 {

    public static float PerimeterOfRectangle(float length, float width) {
        return (length * 2) + (width * 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the length of the rectangle:");
        float length = scanner.nextFloat();
        System.out.println("Please enter the width of the rectangle:");
        float width = scanner.nextFloat();
        float perimeter = PerimeterOfRectangle(length, width);
        System.out.println("The perimeter of the rectangle is: " + perimeter);
    }
}
