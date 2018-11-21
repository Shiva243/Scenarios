package com.scenarios.collection;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.*;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
public class Employee implements  Comparable{

    private Integer id;
    private String name;
    private String designation;

    @Override
    public int compareTo(Object o) {
        Employee e = (Employee) o;
       // System.out.print(this.name.compareTo(e.getName()));
        return this.id.compareTo(e.getId());
    }
    public static Comparator<Employee> EmpNameComparator = new Comparator<Employee>() {
        @Override
        public int compare(Employee o1, Employee o2) {

            return o1.getName().compareTo(o2.getName());
        }
    };

    public static void sortEmp(){
        List<Employee> emp = Util.getEmpList();
        Collections.sort(emp);
        System.out.println("Sort by id ["+emp+"]");
        Collections.sort(emp, Employee.EmpNameComparator);
        emp.sort(Comparator.comparing(Employee::getDesignation));
        System.out.println("Sort by designation ["+emp+"]");
        Map<String, List<Employee>> empMap = new HashMap<>();
        empMap.put("7",Util.getEmpList());
        empMap.put("2",Util.getEmpList());
        empMap.put("xyz",Util.getEmpList());
        System.out.println("Map info ["+empMap+"]");
        empMap = empMap.entrySet().stream().collect(Collectors.toMap(              // Collect final result map
                Map.Entry::getKey,                  // Key mapping is the same
                e -> e.getValue().stream()          // Stream over list
                        .sorted(Comparator.comparing(Employee::getName)) // Sort by priority
                        .collect(Collectors.toList()))  // Collect mapping into list
        );
        System.out.println("after sort Map info by Name ["+empMap+"]");
    }
}
