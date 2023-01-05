package com.demo;
//demo class in Java
public class prog12 {
    public static void main(String[] args){
        Cat cat = new Cat();
        cat.name = "Toby";
        cat.meow();
    }
    static class Cat{
        String name;
        void meow(){
            System.out.println(name + " meows..");
        }


    }
}