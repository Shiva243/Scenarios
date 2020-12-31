package com.scenarios.test;

public class Test {
    public static void main(String[] args) {
        solution(14);
    }
    static int getSum(int n)
    {
        int sum = 0;
        while (n != 0)
        {
            sum = sum + n % 10;
            n = n/10;
        }

        return sum;
    }
    public static int solution(int N) {
        // write your code in Java SE 8
        int m=N+1, s=getSum(N),l=0;

        while(N<m){
            l=getSum(m);
            if((s*2)==l){
                return m;
            }
            m++;
        }
        return m;
    }
}


// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");




 /*class Examp10 {

    protected int a;
    public int b;
    int c;
    protected int d;

    public Examp10()
    {
        a=10;
        b=15;
        c=10;d=10;
    }

    public void sum3()
    {
        System.out.println(a+b+c+d); *//**Line A**//*
    }
}
package Doprctice;
        import Practi.Examp10;

public class Examp10con extends Examp10{
    Examp10con(){}
    public void sum3()
    {
        System.out.println(a+b+c+d); *//**Line B**//*
    }
    public static void main(String []aa)
    {
        Examp10con e=new Examp10con();
        e.sum3();  *//**Line C**//*

    }
}
*/