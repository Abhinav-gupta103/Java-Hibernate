package com.interview.Threads;

public class MyThread2 extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i * 5);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
