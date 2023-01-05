package com.demo;
//largest number in the given array
public class prac_prog2 {
    public static void main(String[] args) {
        int[] arr = {10, 13, 8, 30, 21, 7};
        int largest = arr[0];

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        System.out.println("The largest number in the given array is: " +largest);
    }
}