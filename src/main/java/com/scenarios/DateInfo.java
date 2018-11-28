package com.scenarios;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class DateInfo {

    public static Date convertDateToString(String sDate){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
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
}
