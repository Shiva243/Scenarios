package com.scenarios.test.interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee {
    private int id;
    private String name;

    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
}

public class Test {

    public static void main(String[] args) throws InterruptedException {
        List listLong = new ArrayList<>();
        listLong.add(Long.valueOf(10));
        List listNumbers = listLong;
        System.out.println("listNumber size : " + listNumbers.size());
    }
}