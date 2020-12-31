package com.scenarios.test.collection.streams;

import com.scenarios.test.collection.Employee;
import com.scenarios.test.collection.Util;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsWithMap {

    public static void main(String[] args) {
        List<Employee> listEmp = Util.getEmpList();
        System.out.println("Get List of Employee Names "+listEmp.stream().
                map(e-> e.getName()).collect(Collectors.toList()));
        System.out.println("Get List of Employee Names joining "+listEmp.stream().
                map(e-> e.getName()).collect(Collectors.joining()));
        System.out.println("Get List of Employee Names groupingBy length "+listEmp.stream().
                map(e-> e.getName()).collect(Collectors.groupingBy(String::length)));

    }

}
