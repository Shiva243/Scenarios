package com.scenarios.test.enums;

public class EnumTest {

    public static void main(String[] args){
        for(Mobile m : Mobile.values()) {
            //log.info(m + " costs " + m.showPrice() + " dollars");
        }
        Mobile mb;
        mb = Mobile.valueOf("1");
       // log.info("Selected Mobile: " + mb);
        System.out.println(Mobile.getNameByCode(1));
        String value = Translation.valueOf("").getValue();
        //log.info("Transaltion value " + value);
    }
    enum Mobile {
        Samsung(400), Nokia(250),Motorola(325),xyz(2);
        int price;
        Mobile(int p) {
            price = p;
        }
        public int showPrice() {
            return price;
        }public static String getNameByCode(int code){
            for(Mobile e : Mobile.values()){
                if(code == e.price) return e.name();
            }
            return null;
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
    enum Numbers{
        ONE;
    }
}
