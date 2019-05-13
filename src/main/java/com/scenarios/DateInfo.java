package com.scenarios;

import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class DateInfo {

    public static Date convertDateToString(String sDate){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'hh:mm:ss'Z'");
        LocalDate dateTime = LocalDate.parse(sDate, formatter);
       // log.info("Inside convertDateToString ["+dateTime+"]");
        Date date = Date.from(dateTime.atStartOfDay(ZoneId.systemDefault()).toInstant());
        return date;
    }
    public static Date addHoursToDate(String sDate){
        Calendar cal = Calendar.getInstance();
        cal.setTime(convertDateToString(sDate));
        cal.add(Calendar.HOUR, 23);
        cal.add(Calendar.MINUTE,59);
        cal.add(Calendar.SECOND,59);
        return cal.getTime();
    }

    public static void main(String[] args) throws Exception {
        SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        //sd.setTimeZone(TimeZone.getTimeZone("CST"));
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        sdf.setTimeZone(TimeZone.getTimeZone("CST"));
       // Date d = new Date("2019-01-09T10:45:23");
        System.out.print(sdf.parse("2019-01-09T09:51:90"));

        if(new Date().after(sdf.parse("2019-01-09T09:51:90"))){
            System.out.print("true");

        }

        //System.out.print(convertDateToString("2019-01-09T10:45:23+03:00"));
    }

    public static void timeZone(String date, String zone) {
        ZoneId australia = ZoneId.of(zone);
        String str = "2015-01-05 17:00";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime localtDateAndTime = LocalDateTime.parse(str, formatter);
        ZonedDateTime dateAndTimeInSydney = ZonedDateTime.of(localtDateAndTime, australia);

        System.out.println("Current date and time in a particular timezone : " + dateAndTimeInSydney);

        ZonedDateTime utcDate = dateAndTimeInSydney.withZoneSameInstant(ZoneOffset.UTC);

        System.out.println("Current date and time in UTC : " + utcDate);
        System.out.println("Current date and time in UTC : " + Date.from(utcDate.toInstant()));
    }
}
