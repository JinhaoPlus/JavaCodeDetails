package com.rocking.test;

public class TestInterrupt {
    public static void main(String[] args) throws InterruptedException {
        Thread xThread = new Thread(new Runnable() {
            @Override
            public void run() {
                int i = 0;
                while (true) {
                    if (Thread.currentThread().isInterrupted()) {
                        if (i % 40 == 0)
                            System.out.println("F");
                        System.out.print("F");
                    } else {
                        if (i % 40 == 0)
                            System.out.println(".");
                        System.out.print(".");
                    }
                    i++;
                }
            }
        });
        xThread.start();
        Thread.sleep(10);
        xThread.interrupt();
    }
}
