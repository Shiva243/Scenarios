package com.scenarios.test;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

import java.io.*;
import java.util.List;

public class CSVReadData {

    public static void main(String[] args) throws IOException {
        csvRead("/Users/nisum/Downloads/test.csv");
    }
    public static void csvRead(String csvFile) throws IOException {
        File file = new File(csvFile);

        FileReader filereader = new FileReader(file);
        CSVReader csvReader = new CSVReaderBuilder(filereader)
                .build();
        String [] line = null;
        while( (line=csvReader.readNext() )!= null ){
            System.out.println(line[3]);
        }
    }
    public static void read(String csvFile) {
        try {
            File file = new File(csvFile);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            String[] tempArr;
            while((line = br.readLine()) != null) {
                tempArr = line.split(",");
                for(String tempStr : tempArr) {
                    System.out.print(tempStr + " ");
                }
                System.out.println();
            }
            br.close();
        } catch(IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
