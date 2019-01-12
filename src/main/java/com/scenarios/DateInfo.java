package com.scenarios;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
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
        SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ");
        sd.setTimeZone(TimeZone.getTimeZone("CST"));
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
        sdf.setTimeZone(TimeZone.getTimeZone("CST"));
        Date d = new Date("2019-01-09T10:45:23");
        System.out.print(sdf.format(d));

        //System.out.print(convertDateToString("2019-01-09T10:45:23+03:00"));
    }
}
