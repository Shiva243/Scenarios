package com.scenarios;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Stream;

public class TechMojo {
    private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd:h:mm a");
    public static void main(String[] args) {
        Map<String,Date> tranSeries = new HashMap<>();
        List<String> avgTime = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter The File name with location :");
        String fileName = in.nextLine();
        //String fileName = "/Users/nisum/Documents/Scenarios/src/main/java/com/scenarios/TransactionLaws.txt";
        try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
            stream.forEach(data->{
                String[] tran = data.split(",");
                if(tranSeries.containsKey(tran[0])){
                    long diff = convertStringToDate(tran[1].replace(" ","").trim()+":"+tran[2].trim().toUpperCase())
                            .getTime() - tranSeries.get(tran[0]).getTime();
                    //Date date2 = tranSeries.get(tran[0]);
                    avgTime.add(tran[0]+" -> Transaction average Time "+diff/1000+"Secs");
                }else{
                    tranSeries.put(tran[0], convertStringToDate(tran[1].replace(" ","").trim()+":"+tran[2].trim().toUpperCase()));
                }
            });

        } catch (IOException e) {
            e.printStackTrace();
        }
        /*String[] s = {"T1234, 2020 - 03 - 01 , 3:15 PM, start","T1234, 2020 - 03 - 01 , 3:18 PM, start"};
        for (String data:s){
            String[] tran = data.split(",");
            if(tranSeries.containsKey(tran[0])){
                Date date1 = convertStringToDate(tran[1].replace(" ","").trim()+":"+tran[2].trim().toUpperCase());
                Date date2 = convertStringToDate(tranSeries.get(tran[0]));
                //long diff =date1.getTime()-date2.getTime();
                tranSeries.put(tran[0], "Transaction average Time "+(date1.getTime()-date2.getTime())/1000+"Secs");
            }else{
                tranSeries.put(tran[0], tran[1].replace(" ","").trim()+":"+tran[2].trim().toUpperCase());
            }
    }*/

        System.out.println(avgTime);
    }

    public static Date convertStringToDate(String sDate){
        //LocalDateTime dateTime = LocalDateTime.parse(sDate, formatter);
        return Date.from(LocalDateTime.parse(sDate, formatter).atZone(ZoneId.systemDefault()).toInstant());
    }
}
