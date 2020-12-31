package com.scenarios.ust;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.stream.Stream;

public class Test {

    public static void main(String[] args)
    {
        int[] values = new int[3];
        values[0] = 10;
        values[1] = new Integer(5);
        values[2] = 15;

        for(int i=1; i<values.length; i++)
        {
            System.out.println(values[i]-values[i-1]);
        }
        System.out.println("Done");
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(-8);
        list.add(10);
        list.add(-20);
        //list.add(null);
        Comparator<Integer> r = Collections.reverseOrder();
        Collections.sort(list, r);
        for(int i : list)
            System.out.print(i+ " ");
        System.out.println();
        A obj = new A();
        obj.cal(2, 3);
        HackerEarth1 obj1 = new Hacker();
        obj1.m1(10);
      //  System.out.println(obj.x + " " + obj.y);
        ArrayList<Integer> myList = new ArrayList<>( );
        myList.add(7);
        myList.add(4);
        myList.add(10);
        myList.add(3);
        for(int i : myList)
            System.out.print(i+ " ");
        System.out.println();
        Stream<Integer> myStream = myList.stream();

        Stream<Integer> myVals = myList.stream().sorted().filter((n) -> (n % 2) == 1);
        myVals = myList.stream().filter( (n) -> (n % 2) == 1)
                .filter((n) -> n > 5);
        myVals.forEach((n) -> System.out.print(n + " ") );
    }
}

class HackerEarth
{
    int setValue()
    {
        int a = 10;
        int b = 20;
        try
        {
            ++a;
            b++;
        }

        catch(Exception e)
        {
            System.out.println("Error");
        }

        finally
        {
            a++;
            b--;
        }
        return a+b;

    }

    public static void main(String args[])
    {
        System.out.println(new HackerEarth().setValue());
    }
}

class HackerEarth1
{
    public void m1(double num)
    {
        System.out.println("Inside HackerEarth Class " + num);
    }
}

class Hacker extends HackerEarth1
{
    public void m1(int num)
    {
        System.out.println("Inside Hacker Class " + num);
    }
}
class A{
    public int x;
    private int y;

    void cal(int a, int b){
        x =  a + 1;
        y =  b;
    }

}