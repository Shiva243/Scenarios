package com.scenarios.test.interview;

import java.io.IOException;
import java.util.*;

public class MOR {

    public static void main(String[] args) {

        List<String> stringList = Arrays.asList("Alpha", "Beta", "Gamma", "Delta", "Epsilon");
       // Optional<String> reduced = stringList.stream().collect(Collectors.minBy((o1, o2) -> o1.length() - (o2.length())));
        //Optional<String> reduced = stringList.stream().reduce((s1, s2) -> s1.length() < s2.length() ? s1 : s2);
        //Optional<String> reduced = stringList.stream().collect(Collectors.minBy(Comparator.comparing(String::length)));
        Optional<String> reduced = stringList.stream().reduce((s1, s2) -> s1.length() > s2.length() ? s1 : s2);
        System.out.println(reduced.get());



        List list1= new ArrayList<>();
        list1.add("abc");
        list1.add(2);
        System.out.println(list1.get(0) instanceof Object);
        System.out.println(list1.get(1) instanceof Integer);

        A a1 = new A("abc");

        A a2 = new A("abc");


        System.out.println(a1.s == a2.s);

        System.out.println(a1.s.equals(a2.s));
        double d = 10.0 / -0;
        if (d == Double.POSITIVE_INFINITY) {

        }
        String str = "A";
        str.concat("B");
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("A").append("B");
        System.out.println(str);
        MOR m = new MOR();
        Object o = null;
        m.m1(null);
    }

    public void m1(String str) {
        System.out.println("String");
    }

    public void m1(Object str) {
        System.out.println("Object");
    }
}
    interface iA {
        void method1() throws IOException;
       void  method2() throws ArrayIndexOutOfBoundsException;
        void method3();
        void method4() ;

}

        class A1 implements iA{

            @Override
            public void method1()  throws IOException {

            }

            @Override
            public void method2()  {

            }

            @Override
            public void method3() {

            }

            @Override
            public void method4() throws ArrayIndexOutOfBoundsException {

            }
        }

            abstract class  aA {

        Integer concreteA(){
        return 0;

        }
        }


class a extends aA {

    Integer concreteA(){

    return 1;
    }
    void method1(){
        super.concreteA();
    }

}

class A {
    String s;

    A(String s){
        this.s = s;
    }
}




