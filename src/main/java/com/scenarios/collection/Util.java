package com.scenarios.collection;

import java.util.*;

public class Util {
    private Util(){

    }
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
    public static Set<String> getSettOfString(){
        Set<String> tech = new HashSet<>();
        tech.add("Java");
        tech.add("Spring");
        tech.add("Struts");
        tech.add("Hibernate");
        tech.add("JPA");
        return tech;
    }

    public static Map<String, Set<String>> getMap(){
        Map<String,Set<String>> map = new HashMap<>();
        map.put("1",getSettOfString());
        map.put("4",getSettOfString());
        map.put("3",getSettOfString());
        map.put("5",getSettOfString());
        return map;
    }
 public static List<Employee> getEmpList(){
        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee(2,"Shiva","SSE"));
        empList.add(new Employee(3,"Anish","E"));
        empList.add(new Employee(1,"Chary","M"));
     empList.add(new Employee(1,"Koti","D"));
        return empList;
 }
}
