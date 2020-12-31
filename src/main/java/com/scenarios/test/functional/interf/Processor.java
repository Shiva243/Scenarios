package com.scenarios.test.functional.interf;

public interface Processor {

    default void process(){
        System.out.println("Intel Process");
    }

    static void speed(){
        System.out.println("Intel Process speed");
    }
}
