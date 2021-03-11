package com.atomicprogramming.JChapter4;

import java.util.Scanner;

public class Task4 {

    public static void helloThereThreeTimes(String name) {
        for (int i = 0; i < 3; i++) {
            System.out.println("Hello " + name);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name:");
        String name = scanner.nextLine();
        helloThereThreeTimes(name);
        scanner.close();
    }
}
