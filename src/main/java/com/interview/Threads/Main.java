package com.interview.Threads;

public class Main {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        // t1.start();
        Thread thread = new Thread(t1);
        thread.start();
        MyThread2 t2 = new MyThread2();
        t2.start();

        Runnable aT1 = new Runnable() {
            public void run() {
                System.out.println("This is testing thread");
            }
        };
        Thread t = new Thread(aT1);
        t.start();

        Runnable r = () -> {
            System.out.println("this is lambda");
        };
        Thread h = new Thread(r);
        h.start();
    }
}
