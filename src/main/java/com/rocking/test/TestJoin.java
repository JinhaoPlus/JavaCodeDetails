package com.rocking.test;

public class TestJoin {


    /**
     * @param args
     */
    public static void main(String[] args) {
        Thread thread1 = new Thread() {
            @Override
            public void run() {

                try {
                    System.out.println("thread 1 running....");
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    System.out.println("thread 1 stoped....");
                }
                super.run();
            }
        };
        Thread thread2 = new Thread() {
            @Override
            public void run() {
// TODO Auto-generated method stub

                try {
                    System.out.println("thread 2 running....");
                } catch (Exception e) {
// TODO Auto-generated catch block
                    e.printStackTrace();
                } finally {
                    System.out.println("thread 2 stoped....");
                }
                super.run();
            }
        };
        Thread thread3 = new Thread() {
            @Override
            public void run() {
// TODO Auto-generated method stub

                try {
                    System.out.println("thread 3 running....");
                } catch (Exception e) {
// TODO Auto-generated catch block
                    e.printStackTrace();
                } finally {
                    System.out.println("thread 3 stoped....");
                }
                super.run();
            }
        };
        try {
            thread1.start();
            thread1.join();
            thread2.start();
            thread2.join();
            thread3.start();
            thread3.join();
        } catch (InterruptedException e) {
// TODO Auto-generated catch block
            e.printStackTrace();
        }

    }


}
