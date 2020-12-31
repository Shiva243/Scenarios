package com.scenarios.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class CalendarUtils {
    public static void main(String[] args) throws ParseException {
        //convertJulianDay();
        //weekInfo();
       // monthInfo();
        DateTimeFormatter newPattern = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ssZZ");
             LocalDateTime dt = LocalDateTime.parse("2020-07-15T04:43:42-0400",newPattern);

SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZZ");
sf.parse("2020-07-15T04:43:42-0400");
        System.out.println(sf.parse("2020-07-15T04:43:42-0400"));
    }
    private static void monthInfo() throws ParseException {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        calendar.set(Calendar.DATE, 1);
        SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");

        Date d = sd.parse("2020-08-11");
        int maxDay = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        int date =1;
        while(date<=maxDay){
            //System.out.println(calendar.getTime()+"  "+d);
            System.out.println(d.compareTo(calendar.getTime()));
            if(d.compareTo(calendar.getTime())!=0){
                System.out.println(calendar.getTime());

            }
            calendar.set(Calendar.DATE,date);
            date++;
        }
    }
    private static void weekInfo(){
        Calendar calendar = Calendar.getInstance();
        DateTimeFormatter newPattern = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        int date=1;
        calendar.set(2020,Calendar.AUGUST,date);
        int maxDay = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        String[] days = new String[] { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
        System.out.println("Maxday = "+maxDay);
        while(date<=maxDay){
            LocalDateTime datetime = calendar.getTime().toInstant().atZone(ZoneId.of("CET")).toLocalDateTime();
            String output = datetime.format(newPattern);
            System.out.println("Current day = "+ output +" week "+ days[calendar.get(Calendar.DAY_OF_WEEK)-1 ]);
            date++;
            calendar.set(2020,Calendar.AUGUST,date);
        }
    }
    private static void convertJulianDay() throws ParseException {
        String fileName="D_t_202007203080113";
        System.out.println(fileName.split("_")[2].substring(0,4)+fileName.split("_")[2].substring(6,9));
        DateTimeFormatter newPattern1 = DateTimeFormatter.ofPattern("yyyyDDD");
        DateTimeFormatter newPattern = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate dateTime = LocalDate.parse(fileName.split("_")[2].substring(0,4)+fileName.split("_")[2].substring(6,9), newPattern1);
        System.out.println(Date.from(dateTime.atStartOfDay(ZoneId.systemDefault()).toInstant()));
        Calendar cal = Calendar.getInstance();
        cal.setTime(Date.from(dateTime.atStartOfDay(ZoneId.systemDefault()).toInstant()));
        //LocalDateTime datetime = dateTime.atZone(ZoneId.of("CET")).toLocalDateTime();
        String output1 = dateTime.format(newPattern);
        String[] days1 = new String[] { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
        System.out.println("Current day = "+ output1 +" week "+ days1[cal.get(Calendar.DAY_OF_WEEK)-1 ]);
        System.out.println(output1);

        SimpleDateFormat date1 = new SimpleDateFormat("yyyyDDD");
        System.out.println(date1.parse(fileName.split("_")[2].substring(0,4)+fileName.split("_")[2].substring(6,9)));

    }
}
