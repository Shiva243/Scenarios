package com.scenarios.test.interview;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

class ColorPack {
    Integer[] a = new Integer[0];
    static int shadeCount = 12;
    static int getShadeCount() {
        return shadeCount;
    }

}
class Artist {
    public static void main(String args[]) {
        ColorPack pack1 = new ColorPack();
        System.out.println(pack1.getShadeCount());
        List<Integer> aList = new CopyOnWriteArrayList<Integer>(); // LINE A aList.addAll(Arrays.asList(10, 20, 30, 40));
        System.out.println(aList);
    }
}

class myClss{
    public int x;

    public myClss(int a){ x = 10; }
    public int getVal(){ return x;}
}

class HelloConfig {
    public void main(String[] args){
       // myClss b = new myClss();
       // System.out.Println(b.getVal());
    }
}
class AB{
    void methodA() throws IOException {

    }
}
class ABC extends AB{
    void methodA()  throws ArithmeticException {

    }
}
class GenericException extends Throwable { }