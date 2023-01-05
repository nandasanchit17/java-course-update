package com.demo;

public class prog13 {
    public static void main(String[] args) {
        String str = "Sanchit Nanda";
        String[] word = str.split("\\s");
        int char_count = 0;
        for (int i = 0; i < word.length; i++) {
            char_count += word[i].length();
        }
        System.out.println("Number of words: " + word.length);
        System.out.println("Number of characters: " + char_count);
    }

}