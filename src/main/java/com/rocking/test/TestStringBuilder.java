package com.rocking.test;


public class TestStringBuilder {

    public void runn() {
        System.out.println("START");
        final StringBuilder builder = new StringBuilder();
        Thread thread0 = new Thread(new Runnable() {
            @Override
            public void run() {
                int i = 0;
                while (i<10000) {
                    builder.append("ABC");
                    i++;
                }
            }
        });
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                int i = 0;
                while (i<10000) {
                    builder.append("ABC");
                    i++;
                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                int i = 0;
                while (i<10000) {
                    builder.append("ABC");
                    i++;
                }
            }
        });
        thread0.start();
        thread1.start();
        thread2.start();
        System.out.println("JOIN");
        try {
            thread0.join();
            thread1.join();
            thread2.join();
            System.out.println("JOINED");
            System.out.println(builder.toString());
        } catch (InterruptedException e) {
            e.printStackTrace();

        }
    }

    public static void main(String[] args) {
        new TestStringBuilder().runn();
    }
}
