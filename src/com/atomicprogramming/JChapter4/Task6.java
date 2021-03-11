package com.atomicprogramming.JChapter4;

import java.util.Scanner;

public class Task6 {

    public static void tailName(String name) {
        String tailName = name.substring(1);
        System.out.println("The tail name is: " + tailName);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name:");
        String name = scanner.nextLine();
        tailName(name);
    }
}
