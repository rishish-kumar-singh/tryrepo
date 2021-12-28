package com.company.code;

public class ThreadExample {

    public static void main(String[] args) {

        //create thread using lambda expression

        Runnable runnable1=()->{
            System.out.println("Task 1 is running...");
        };

        Runnable runnable2=()->{
            System.out.println("Task 2 is running...");
        };

        Runnable runnable3=()->{
            System.out.println("Task 3 is running...");
        };

        Thread t1=new Thread(runnable1);
        Thread t2=new Thread(runnable2);
        Thread t3=new Thread(runnable3);
        t1.start();
        t2.start();
        t3.start();
    }

}
