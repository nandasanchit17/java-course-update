package com.demo;

public class prog15 {

    private static class overload {
        static void sum(int x, int y) {
            System.out.println("The sum of 2 numbers is: " + (x + y));
        }

        static void sum(int x, int y, int z) {
            System.out.println("The sum of 3 numbers is: " + (x + y + z));
        }

        static void sum(int x, int y, int z, int w) {
            System.out.println("The sum of 4 numbers is: " + (x + y + z + w));
        }
    }

    public static void main(String[] args) {
        overload obj = new overload();
        overload.sum(10, 20);
        overload.sum(10, 20, 30);
        overload.sum(10, 20, 40, 40);
    }
}