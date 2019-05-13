package com.scenarios.javatest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestProgram {
    public static void main(String[] args) {
        //SuperA subB = new SubB();
        //subB.get(); // compileTime error because private method can't access the outside the class
        SubB subB1 = new SubB();
        subB1.get();

    }
}
 class SuperA{
    private void get(){
        System.out.println("SuperA");
    }
 }
 class SubB extends SuperA{
     public void get(){
         System.out.println("SubB");
         String a=new String("hai"), b= new String("hai") ;
         String x="java",y="java";
         System.out.print(a.equals(b));//true
         System.out.print(a==b);//false
         System.out.println(x==y);//true
        // System.out.println(b.hashCode());
         List<String> list = new ArrayList<>();
         list.add("Hai");
         list.add("Hai1");
         List<String> list1 = new ArrayList<>();
         list1.add("Hai1");
         list1.add("Hai12");
         List<List<String>> lists = new ArrayList<>();
         lists.add(list);
         lists.add(list1);
         List<String> list2 = new ArrayList<>();
         lists.forEach(list2 :: addAll);
         System.out.println(list2);
         System.out.println(lists.stream().flatMap(List :: stream).collect(Collectors.toList()));
     }

 }