package com.scenarios;

public class CoffeeShop {

    public static void main(String []args){
        int[] c = {5,5,10,10,5,20};
        if(c.length >0){
            System.out.println(isBillPay(c));
        }

    }
    private static boolean isBillPay(int[] c){
        int count5=0, count10=0;
        for(int i=0; i<c.length; i++ ){
            if(c[i] == 5 ){
                count5++;
            }else if(c[i] == 10){
                count10++;
                if(count5 ==0){
                    return false;
                }
                count5--;
            }else if(c[i] == 20){
                if(count10 == 0 && count5 <3){
                    return false;
                }else if(count10 !=0 && count5 <1 ){
                    return false;
                }else{
                    if(count10 !=0){
                        count10--;
                        count5--;
                    }else{
                        count5=count5-3;
                    }
                }

            }else{
                return false;
            }
        }
        return true;
    }
}
