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
    }

}
