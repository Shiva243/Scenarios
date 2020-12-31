package com.scenarios.test;

public class TestScenario {
    public static void main(String[] args) {
        System.out.print(oddOccurrencesInArray(new int[]{9, 3, 9, 3,9,7,9}));
    }
    /*A = [1, 2, 3, 4,5]
 K = 4
 the function should return [1, 2, 3, 4]*/
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
}
