package com.scenarios.arrays;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class ArraysHelper {
    /*that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.

   For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.

   Given A = [1, 2, 3], the function should return 4.

   Given A = [−1, −3], the function should return 1.*/
    public static int solution() {
        int[] A = {-1, 2, -3};
        int i = 0,
                count = 0,
                N = A.length;
        int[] B = new int[100001];
        for (i = 0; i < N; i++)
            if (A[i] > 0 && A[i] < 100001) {
                B[A[i]] = A[i];         // ... putting value x at index x in B ...
                count++;                // ... and keep a count of positives
            }
        for (i = 1; i < count + 1; i++) // Find first empty element in B
            if (B[i] == 0)
                return i;               // Index of empty element = missing int
        return count + 1;
    }

    //Print highest word count and if both word have same count print the last word(desending)
    public static String voteWinner(String[] votes) {
        // Please write your code here.
        Map<String,Integer> votesWord = new HashMap<>();
        for(String vote:votes){
            Integer count = votesWord.get(vote);
            if(null==count){
                count=0;
            }
            votesWord.put(vote,count+1);
        }

        Map<String, Integer> sortedByCount= votesWord.entrySet().stream()
                .sorted((Map.Entry.<String, Integer>comparingByKey().reversed()))
                .sorted((Map.Entry.<String, Integer>comparingByValue().reversed()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        System.out.println(sortedByCount.get(sortedByCount.keySet().toArray()[0]));
        return (String)sortedByCount.keySet().toArray()[0];
    }

    /*A = [1, 2, 3, 4]
    K = 4
    the function should return [1, 2, 3, 4]*/
    public static int[] getValue(Integer[] arr, int k){
        int arr1[] = new int[arr.length];
        if(k>=arr.length) {
            k=k%arr.length;
        }
// System.out.print(k);
        for(int i=0;i<arr.length;i++){
            arr1[i]=arr[k];
            System.out.print(arr[k]);
            k=(k+1)%arr.length;
        }
        return arr1;
    }
    /*A = [3, 8, 9, 7,6]
    K = 3
    the function should return [9,7,6,3,8]*/
    public static int[] solution(int[] arr, int k) {
        if(arr.length==0 || k<=0){
            return arr;
        }
        int arr1[] = new int[arr.length];
        if(k>=arr.length) {
            k=k%arr.length;
        }
        k=k>0?arr.length-k:k;
// System.out.print(k);
        for(int i=0;i<arr.length;i++){
            // System.out.print(k);
            arr1[i]=arr[k];
            k=(k+1)%arr.length;
        }
        return arr1;
    }
    //OddOccurrencesInArray
    /*A non-empty array A consisting of N integers is given. The array contains an odd number of elements, and each element of the array can be paired with another element that has the same value, except for one element that is left unpaired.

    For example, in array A such that:

    A[0] = 9  A[1] = 3  A[2] = 9
    A[3] = 3  A[4] = 9  A[5] = 7
    A[6] = 9
    the elements at indexes 0 and 2 have value 9,
    the elements at indexes 1 and 3 have value 3,
    the elements at indexes 4 and 6 have value 9,
    the element at index 5 has value 7 and is unpaired.*/

    public static int oddOccurrencesInArray(int[] A){
        if(A.length>1){
            for(int i=0;i<A.length;i++) {
                if ((i + 1) < A.length && A[i]==A[i+1]) {
                    continue;
                } else if((i + 4) < A.length && A[i+2]==A[i+4])
                    continue;
                else if(i+1==A.length)
                    return A[i];
                else
                    return A[i+2];
            }
        }
        return A.length==1?A[0]:0;
    }
     /*given three integers X, Y and D, returns the minimal number of jumps from position X to a position equal to or greater than Y.

    For example, given:

    X = 10
    Y = 85
    D = 30
    the function should return 3, because the frog will be positioned as follows:

    after the first jump, at position 10 + 30 = 40
    after the second jump, at position 10 + 30 + 30 = 70
    after the third jump, at position 10 + 30 + 30 + 30 = 100*/
    public static int solution(int X, int Y, int D) {
        if(X<Y && D>0){
            return Integer.valueOf( new BigDecimal(Y-X).divide(new BigDecimal(D),2,BigDecimal.ROUND_CEILING).setScale(0,BigDecimal.ROUND_CEILING).toString());
        }
        return 0;
    }
    /*An array A consisting of N different integers is given. The array contains integers in the range [1..(N + 1)], which means that exactly one element is missing.

    Your goal is to find that missing element.

    Write a function:

    class Solution { public int solution(int[] A); }

    that, given an array A, returns the value of the missing element.

    For example, given array A such that:

    A[0] = 2
    A[1] = 3
    A[2] = 1
    A[3] = 5
    the function should return 4, as it is the missing element.*/
    public static int solution(int[] A) {
        int len = A.length;
        if(len>1){
            //len=len+1;
            int sum = ((len+1)*(len+1+1))/2;
            long suma=0;
            for(Integer i : A){
                suma = suma +i;
            }
            return sum-(int)suma;
        }
        return len == 0?1:len==A[0]?(len)+A[0]:A[0]-(len);
    }
    public static int solution1(int[] A){
        if(A.length>1){

        }

        return 0;
    }

    public static int solution(int a) {
        String s= String.valueOf(a);
        StringBuffer m= new StringBuffer();
        int count=0;
        for(int i=0;i<=(s.length()/2);i++){

            if(count>0) {
                m.append(s.charAt(s.length()-count));
                m.append(i==(s.length()-count)?"":s.charAt(i));
            }
            else
                m.append(s.charAt(i));
            count++;
        }
        return Integer.parseInt(m.toString());

    }
}
