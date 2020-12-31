package com.scenarios.test;

// Java program to print anagrams
// together using dictionary
import java.util.*;

public class StringArrang {

    static HashMap<Character, Character> map;

    private static void printAnagrams(String arr[])
    {
         HashMap<String, List<String> > map = new HashMap<>();

        // loop over all words
        for (int i = 0; i < arr.length; i++) {

            // convert to char array, sort and
            // then re-convert to string
            String word = arr[i];
            char[] letters = word.toCharArray();
            Arrays.sort(letters);
            String newWord = new String(letters);

            // calculate hashcode of string
            // after sorting
            if (map.containsKey(arr[i])) {

                map.get(newWord).add(word);
            }
            else {

                // This is the first time we are
                // adding a word for a specific
                // hashcode
                List<String> words = new ArrayList<>();
                words.add(word);
                map.put(newWord, words);
            }
        }

        // print all the values where size is > 1
        // If you want to print non-anagrams,
        // just print the values having size = 1
        for (String s : map.keySet()) {
            List<String> values = map.get(s);
            if (values.size() > 1) {
                System.out.print(values);
            }
        }
    }
    private static boolean isDuplicate(String word){
        for(char c: word.toCharArray()){
            if(map.containsKey(c))
                return true;
            map.put(c,c);
        }
        return false;
    }
    public static void main(String[] args)
    {
        map = new HashMap<>();
        // Driver program
        String arr[] = { "cat", "dog", "tac", "god", "act" };
      //  printAnagrams(arr)
        int A[]={1,2,3};


        //String[] A = { "co", "dil","ity" };//o/p codil, coity, dilcoor ityco
       // String[] A = { "abc", "yyy","def","csv" };//O/P abcdef,defabc,defcsv or csvdef
        int k = 3;
        // if array contains repeated elements,
        // sort the array to handle duplicate combinations
        // Arrays.sort(A);
        // process elements from left to right
        recur(A, "", 0, A.length, k);
    }
        // Function to print all distinct combinations of length k
        public static void recur(int[] A, String out, int i, int n, int k)
        {
            // invalid input
            if (k > n) {
                return;
            }
            // base case: combination size is k
            if (k == 0) {
                System.out.println(out);
                return;
            }
            // start from next index till last index
            for (int j = i; j < n; j++)
            {
                // add current element A[j] to solution & recur for next index
                // (j+1) with one less element (k-1)
                recur(A, out + " " + (A[j]) , j + 1, n, k - 1);

                // uncomment below code to handle duplicates

            }
        }



}
