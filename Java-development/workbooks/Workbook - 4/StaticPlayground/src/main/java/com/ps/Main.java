package com.ps;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        // counter Example
            // instance counter
            // static counter

        // instance increment
        //static increment



        Counter count1 = new Counter();
        Counter count2 = new Counter();

        count1.instanceIncrement();

        System.out.println(count1.instanceCount);
        System.out.println(count1.staticCount);
    }
}