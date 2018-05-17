package com.scenarios.enums;

public class EnumTest {

    public static void main(String[] args){
        for(Mobile m : Mobile.values()) {
            System.out.println(m + " costs " + m.showPrice() + " dollars");
        }
        Mobile mb;
        mb = Mobile.valueOf("Samsung");
        System.out.println("Selected Mobile: " + mb);
        String value = Translation.valueOf("").getValue();
        System.out.println("Transaltion value " + value);
    }
    enum Mobile {
        Samsung(400), Nokia(250),Motorola(325);
        int price;
        Mobile(int p) {
            price = p;
        }
        public int showPrice() {
            return price;
        }
    }
    enum Translation{
        OP("Y"),
        ACC("EP"),
        PCH("N");
        private String value;
        public String getValue(){
            return this.value = value;
        }
        Translation(String value){
            this.value = value;
        }
    }
}