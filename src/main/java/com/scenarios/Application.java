package com.scenarios;




import com.scenarios.collection.Employee;
import com.scenarios.collection.Util;

import java.net.InetAddress;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;


public class Application{
    public static void main(String[] args) throws  Exception{
        StringBuffer s = new StringBuffer("ama");
        s.reverse().toString().equalsIgnoreCase("Ama");
        /*log.info("Welcome to Java8");
        log.info("Sum of Int's ["+new Streams().sumOfInt(Util.getListOfInt())+"]");
        log.info("add hours for Date \"String\" ["+addHoursToDate("18/05/2018")+"]");
        log.info(new Streams().iterateMap());*/
       // Employee.sortEmp();
       // new Streams().listCompare();
        InetAddress addr;
      // System.out.println(
   // InetAddress.getLocalHost().getHostName());
      // new TestB().get();
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        //cal.add(Calendar.DATE, -15);
        System.out.println(cal.getTimeInMillis());
        DateInfo.timeZone("2019030315172452", "America/New_York");
        Employee e1 = new Employee(1,"Java3232","D");
        System.out.println(Util.getEmpList().contains(e1));
        List<Employee> el = Util.getEmpList();

      el.removeIf(e-> e.equals(e1));
        System.out.println(el);

        System.out.println(Util.getEmpList());
    }


}