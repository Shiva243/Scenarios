package com.scenarios.ust;



/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.*/
//imports for BufferedReader
import java.io.BufferedReader;
        import java.io.InputStreamReader;

//import for Scanner and other utility classes
        import java.util.*;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TestClass {
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input*/

        //BufferedReader
       // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //String name = br.readLine();                // Reading input from STDIN
        // System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
       // Scanner s = new Scanner(System.in);
        String name = "aabcccabba";                 // Reading input from STDIN
        System.out.println("Hi, " + name + "."+name.length()/2);    // Writing output to STDOUT

        String l= name.substring(0,name.length()/2);
        String r = name.substring(name.length()/2);
        System.out.println("Hi, " +l+"  "+r);
        name = r+l;

            if(r.substring(r.length()-1).equals(l.substring(0,1))){
                name =getString(r,l,name);
            }

        //name = r+l;
        System.out.println(name.length());
        // Write your code here.l

    }

    private static String getString(String r, String l, String name){
        //if(r.substring(r.length()-1).equals(l.substring(0,1))){
            r = r.substring(0,r.length()-1);
            System.out.println(r);
            l=l.substring(1);
            name =r+l;
       // }
        return name;
    }
}

