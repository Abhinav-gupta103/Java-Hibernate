package com.interview.Threads;

public class MyThread1 implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i < 20; i++) {
            System.out.println("i = " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
