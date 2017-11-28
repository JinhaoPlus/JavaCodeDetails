package com.rocking.test;

class Demo {
    private ThreadLocal<String> secret = new ThreadLocal<>();

    public void execute() {
        if (secret.get() == null)
            secret.set(Thread.currentThread().getName() + "~SECRET");
    }

    public void print() {
        System.out.println(Thread.currentThread().getName() + " RUNNING " + secret.get());
    }
}

public class TestThreadLocal {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                Demo demo = new Demo();
                demo.execute();
                demo.print();
            }
        };
        new Thread(runnable).start();
        new Thread(runnable).start();
        new Thread(runnable).start();
        new Thread(runnable).start();
        new Thread(runnable).start();
    }
}
