package com.demo;
//average of an array
public class prac_prog1 {
    public static void main(String[] args) {
        double[] array = {12.1, 13.0, 24.8, 34};
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println(sum / array.length);

    }
}