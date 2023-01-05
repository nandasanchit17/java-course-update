package com.demo;

import java.awt.*;

//using point 
public class prog4 {
    public static void main(String[] args) {
        Point pointa = new Point(12, 13);
        System.out.println("pointa = " + pointa);
        pointa.move(14, 15);
        System.out.println("pointa = " + pointa);
    }
}