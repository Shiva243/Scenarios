package com.scenarios.test.interview;

import java.io.*;

class Employee1 extends superEmployee {
    public String firstName;
    private static final long serialVersionUID = 5462223600l;
}

class superEmployee implements Serializable{
    public String lastName;
    static String companyName;
    transient String address;
    static transient String companyCEO;
}

public class DemoClass {
    public static void main(String[] args) {
        Employee1 emp = new Employee1();
        emp.firstName = "Vivekanand";
        emp.lastName = "Gautam";
        emp.companyName = "JBT";
        //Below part needs to be removed in case address field is made final
        emp.address = "MUM";
        emp.companyCEO = "ME CEO";
        try {
            FileOutputStream fileOut = new FileOutputStream("./employee.txt");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(emp);
            out.close();
            fileOut.close();
            System.out.printf("Serialized data is saved in ./employee.txt file");
        } catch (IOException i) {
            i.printStackTrace();
        }
    }
}

class Demo2Class {
    public static void main(String[] args) {
        Employee1 emp = null;
        try {
            FileInputStream fileIn = new FileInputStream("./employee.txt");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            emp = (Employee1) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException i) {
            i.printStackTrace();
            return;
        } catch (ClassNotFoundException c) {
            System.out.println("Employee class not found");
            c.printStackTrace();
            return;
        }
        System.out.println("First Name of Employee: " + emp.firstName);
        System.out.println("Last Name of Employee: " + emp.lastName);
        System.out.println("Company Name: "+emp.companyName);
        System.out.println("Company CEO: "+emp.companyCEO);
        System.out.println("Company Address: "+emp.address);
    }
}