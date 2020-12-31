package com.scenarios.opentext;
import java.util.*;

public class OpenText1 {
}
// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    int i=0;
    public int solution(int N) {
        // write your code in Java SE 8
        if(N<=10){
            return N;
        }
        for(int i=0;i<=100000;i++){
            if(i==N){
                continue;
            }
            if(N==sum(i)){
                return i;
            }

        }
        return N;
    }
    private int sum(int n){
        int sum = 0;
        while (n != 0 )
        {
            sum = sum + n % 10;
            n = n/10;
        }
        return sum;
    }
}


// you can also use imports, for example:

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution1 {
    public int solution(int[] A) {
        // write your code in Java SE 8
        HashMap<Integer, Integer> mp = new HashMap<Integer,Integer>();

        for (int i = 0; i < 200000 ; i++)
        {
            mp.put(i, 0);
        }

        int ans = -1;

        for (int i = 0; i < A.length; i++)
        {
            int dSum = digitSum(A[i]);

            if ((int)mp.get(dSum) != 0)
            {
                ans = Math.max(ans, (int)mp.get(dSum) + A[i]);
            }
            mp.put(dSum,Math.max((int)mp.get(dSum), A[i])) ;
        }
        return ans;
    }
    private int digitSum(int n){
        int sum = 0;
        while (n != 0 )
        {
            sum = sum + n % 10;
            n = n/10;
        }
        return sum;
    }

}
