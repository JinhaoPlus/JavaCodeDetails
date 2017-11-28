package com.rocking.test;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

class MyCallable extends FutureTask<String>{

    public MyCallable(Callable<String> callable) {
        super(callable);
    }
}

public class TestFuture {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MyCallable ccc = new MyCallable(new Callable<String>() {
            @Override
            public String call() throws Exception {
                Thread.sleep(10000);
                return "CCC";
            }
        });
        Thread thread = new Thread(ccc);
        thread.start();
        System.out.println(ccc.get());

    }
}
