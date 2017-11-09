package com.appd.pej;

public class Main {
    public static void main(String[] args) {
        try {
            test();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public static void test() throws InterruptedException {
        int value = 1;
        while (value < 10){
            System.out.println("Desgual");
            Thread.sleep(2000);
            value+=1;
        }
        callingFromTest();
    }


    public static void callingFromTest() throws InterruptedException {
        System.out.println("I'm in submethod");
        Thread.sleep(Long.parseLong("2000"));
        callTwo();
    }

    public static void callTwo() throws InterruptedException {
        System.out.println("I'm in two");
        Thread.sleep(200);
        callThree();
    }

    public static void callThree() throws InterruptedException {
        System.out.println("I'm in three");
        Thread.sleep(200);
        callFour();
    }

    public static void callFour() throws InterruptedException {
        System.out.println("I'm in four");
        Thread.sleep(200);
        callFive();
    }

    public static void callFive() throws InterruptedException {
        System.out.println("I'm in five");
        Thread.sleep(200);
    }



}
