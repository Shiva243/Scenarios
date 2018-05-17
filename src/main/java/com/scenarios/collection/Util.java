package com.scenarios.collection;

import java.util.ArrayList;
import java.util.List;

public class Util {
    public static List<String> getListOfString(){
        List<String> tech = new ArrayList<>();
        tech.add("Java");
        tech.add("Spring");
        tech.add("Struts");
        tech.add("Hibernate");
        tech.add("JPA");
        tech.add("Angular");
        return tech;
    }
    public static List<Integer> getListOfInt(){
        List<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        l.add(6);
        l.add(7);
        l.add(8);
        return l;
    }
}
