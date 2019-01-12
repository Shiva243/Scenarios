package com.scenarios.overridding;

import javafx.print.Collation;

import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TestB {

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

       // System.out.print(Collections.sort(""+votesWord.keySet()));
return "";
    }
    public static void main(String[] args) {
       // Scanner reader = new Scanner(System.in);
       // int votesCount = reader.nextInt();
        //reader.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
       // String[] votes = new String[votesCount];
        /*for (int i = 0; i < votesCount; i++) {
            String votesItem = reader.nextLine();
            votes[i] = votesItem;
        }*/
        System.out.println(TestB.voteWinner(new String[]{"Glenn","Emily","Glenn","Emily"}));
    }
}
