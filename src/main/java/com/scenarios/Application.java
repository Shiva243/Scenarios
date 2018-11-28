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
        /*log.info("Welcome to Java8");
        log.info("Sum of Int's ["+new Streams().sumOfInt(Util.getListOfInt())+"]");
        log.info("add hours for Date \"String\" ["+addHoursToDate("18/05/2018")+"]");
        log.info(new Streams().iterateMap());*/
       // Employee.sortEmp();
        new Streams().listCompare();
    }

}