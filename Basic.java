package org.ninad;
/**
 * The Basic class for Java example
 */
public class Basic  {
    public static void main(String[] args) {
        Basic  basic = new Basic();
        System.out.println(basic.add(10,20));
        System.out.println(basic.subtract(50,20));
        System.out.println(basic.multiply(500,60));
        System.out.println(basic.divide(500,50));
    }

    public static Integer add(Integer a, Integer b){
        return a + b;
    }
    public static Integer subtract(Integer a, Integer b){
        return a-b;
    }
    public static Integer multiply(Integer a, Integer b){
        return a*b;
    }
    public static Integer divide(Integer a, Integer b){
        return b!=0?a/b:a;
    }
}
