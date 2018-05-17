package com.scenarios;


import com.scenarios.collection.Streams;
import com.scenarios.collection.Util;

public class Application{
    public static void main(String[] args){
        System.out.println("Welcome to Java8");
        System.out.println("Sum of Int's ["+new Streams().sumOfInt(Util.getListOfInt())+"]");
    }

}