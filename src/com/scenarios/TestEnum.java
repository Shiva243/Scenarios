package com.scenarios;

import java.lang.*;

// enum showing Mobile prices
enum Mobile {
    Samsung(400), Nokia(250),Motorola(325);

    int price;
    Mobile(int p) {
        price = p;
    }
    int showPrice() {
        return price;
    }

}
enum Transaltion{
    OP("Y"),
    ACC("EP"),
    PCH("N");

    private String value;
    public String getValue(){
        return this.value = value;
    }
    Transaltion(String value){
        this.value = value;
    }
}

public class TestEnum {

    public static void main(String args[]) {

        System.out.println("CellPhone List:");
        for(Mobile m : Mobile.values()) {
            System.out.println(m + " costs " + m.showPrice() + " dollars");
        }

        Mobile ret;
        ret = Mobile.valueOf("Samsung");
        System.out.println("Selected : " + ret);

        String value = Transaltion.valueOf("").getValue();
        System.out.println("Transaltion value " + value);
    }
}
