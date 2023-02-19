package org.ninad.spring.app;

public class GenericsExample {

    public static void main(String[] args) {
        Printer<Integer> printer = new Printer<>(23);
        printer.print();

        Printer<String> strPrinter = new Printer<>("23");
        strPrinter.print();

    }
}
