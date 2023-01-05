package com.demo;
//strings
public class prog10 {
    public static void main(String[] args) {
        String fname = "Sanchit";
        String lname = "Nanda";
        String name = fname + " " + lname;
        System.out.println(name);
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.substring(2,8));
        System.out.println(" ".isBlank());
        System.out.println(" ".isEmpty());
    }

}