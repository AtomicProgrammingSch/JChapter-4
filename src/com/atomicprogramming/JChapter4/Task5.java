package com.atomicprogramming.JChapter4;

import java.util.Scanner;

public class Task5 {

    public static void headName(String name) {
        char character = name.charAt(0);
        System.out.println("The first character in the name " + name + " is " + character);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name:");
        String name = scanner.nextLine();
        headName(name);
    }
}
