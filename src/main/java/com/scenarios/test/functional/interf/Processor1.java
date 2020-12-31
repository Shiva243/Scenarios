package com.scenarios.test.functional.interf;

public interface Processor1 {

    default void process(){
        System.out.println("AMD Process");
    }

    static void speed(){
        System.out.println("AMD Process speed");
    }
}
