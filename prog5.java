package com.demo;

import java.util.Arrays;
// arrays in java
public class prog5 {
    public static void main(String[] args) {
        int[] number = new int[3];
        number[0] = 1;
        number[1] = 2;
        number[2] = 3;

        System.out.println(Arrays.toString(number));

        int[] num2 = {2, 3, 4, 5, 6};
        for (int i = 0; i < num2.length; i++) {
            System.out.println(num2[i]);
        }
        int[] num3 = new int[4];
        Arrays.fill(num3, -3);
        num3[0] = 17;
        System.out.println(Arrays.toString(num3));
    }
}