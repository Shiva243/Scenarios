package com.scenarios;


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test  {
    public static void main(String[] args) {
        String x;
        x="b";
        System.out.print(x);
        int n= 14;
        System.out.print(n);

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
    public  long solution(int[] A) {
        // write your code in Java SE 8

        Map<Integer,Long> map=  Arrays.stream(A).boxed()
                .collect(Collectors.groupingBy(s -> s, Collectors.counting()));
        System.out.println("this is a debug message"+map.get(1));
        return map.get(1);
    }
}
