package com.atomicprogramming.JChapter4;

public class task1 {

    public static int doubleFunction(int a) {
        return a * 2;
    }

    public static void main(String[] args) {
        // example --> double 3
        int doubled = doubleFunction(3);
        System.out.println("Three doubled is: " + doubled);
    }
}
