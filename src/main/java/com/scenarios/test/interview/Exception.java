package com.scenarios.test.interview;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exception {
    public static void main(String[] args) throws FileNotFoundException {
        try (FileInputStream f = new FileInputStream("ttt"))
        {
            String str = "A";
            str.concat("B");
            System.out.println(str);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }




}
