package com.scenarios;


import com.scenarios.collection.Employee;
import com.scenarios.collection.Streams;
import com.scenarios.collection.Util;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static com.scenarios.DateInfo.*;


public class Application{
    public static void main(String[] args){
        /*System.out.println("Welcome to Java8");
        System.out.println("Sum of Int's ["+new Streams().sumOfInt(Util.getListOfInt())+"]");
        System.out.println("add hours for Date \"String\" ["+addHoursToDate("18/05/2018")+"]");
        System.out.println(new Streams().iterateMap());*/
        Employee.sortEmp();
    }

}