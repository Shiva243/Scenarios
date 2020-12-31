package com.scenarios.test.collection;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.java.Log;

import java.util.*;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Log
public class Employee implements  Comparable{

    private Integer id;
    private String name;
    private String designation;
    private Address address;

    @Override
    public int compareTo(Object o) {
        Employee e = (Employee) o;
       // System.out.print(this.name.compareTo(e.getName()));
        return this.id.compareTo(e.getId());
    }
    public static final Comparator<Employee> EmpNameComparator = new Comparator<Employee>() {
        @Override
        public int compare(Employee o1, Employee o2) {

            return o1.getName().compareTo(o2.getName());
            //return Comparator.compare(o1, o2);
        }
    };

    public static void sortEmp(){
        List<Employee> emp = Util.getEmpList();
        Collections.sort(emp);
        log.info("Sort by id ["+emp+"]");
        Collections.sort(emp, Employee.EmpNameComparator);
        emp.sort(Comparator.comparing(Employee::getDesignation));
        log.info("Sort by designation ["+emp+"]");
        Map<String, List<Employee>> empMap = new HashMap<>();
        empMap.put("7",Util.getEmpList());
        empMap.put("2",Util.getEmpList());
        empMap.put("xyz",Util.getEmpList());
        log.info("Map info ["+empMap+"]");
        empMap = empMap.entrySet().stream().collect(Collectors.toMap(              // Collect final result map
                Map.Entry::getKey,                  // Key mapping is the same
                e -> e.getValue().stream()          // Stream over list
                        .sorted(Comparator.comparing(Employee::getName)) // Sort by priority
                        .collect(Collectors.toList()))  // Collect mapping into list
        );
        log.info("after sort Map info by Name ["+empMap+"]");
    }
}
