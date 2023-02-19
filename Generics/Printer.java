package org.ninad.spring.app;

public class Printer <T>{
    T thingsToPrint;

    public Printer(T thingsToPrint){
        this.thingsToPrint = thingsToPrint;
    }

    public void print(){
        System.out.println(thingsToPrint);
    }

}
