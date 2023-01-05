package com.demo;

import java.util.StringTokenizer;

public class prog16 {
    public static void main(String[] args){
        StringTokenizer s1 =  new StringTokenizer("Sanchit Nanda");
        while(s1.hasMoreTokens()){
            System.out.println(s1.nextToken());
        }
    }
}