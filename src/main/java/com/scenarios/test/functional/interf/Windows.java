package com.scenarios.test.functional.interf;

public class Windows implements Processor, Processor1 {

    //didn't overeride this method without public the compiler doesn't know the which method invoked or override.
   /*  void process(){
        System.out.println("Intel Process for windows");
    }*/

    public static void main(String[] args) {
        Processor w = new Windows();
        w.process();
        Processor.speed();
        Processor1.speed();
    }

    @Override
    public void process() {

    }
}
