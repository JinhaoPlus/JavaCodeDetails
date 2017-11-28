package com.rocking.test;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

public class TestCallable {
    public static void main(String[] args) throws ExecutionException, InterruptedException, FileNotFoundException {
//        ExecutorService executorService = Executors.newFixedThreadPool(10);
//        Callable<Integer>[] callables = new Callable[10];
//        Integer[] res = new Integer[10];
//        for (int i = 0; i < 10; i++) {
//            callables[i] = new Callable<Integer>() {
//                public Integer call() throws Exception {
//                    Thread.sleep(1000);
//                    System.out.printf("chid end");
//                    return 1;
//                }
//            };
//        }
//
//        List<Future<Integer>> futures = executorService.invokeAll(Arrays.asList(callables));
//
//        for (Future<Integer> x :
//                futures) {
//            System.out.println(x.get());
//        }
//        System.out.println("father end");
//        executorService.shutdown();

//        BufferedReader reader = new BufferedReader(new FileReader(new File("in.txt")));
//        System.out.println(reader.lines().count());

        List<String> arr = new ArrayList<>();
        for (int j = 0; j < 101; j++) {
            arr.add("0");
        }
        for (int i = 0; i < Math.ceil((double) 101 / 10); i++) {
            if (arr.size() > (i + 1) * 10)
                arr.subList(i * 10, (i + 1) * 10);
            else
                arr.subList(i * 10, arr.size());
            System.out.println(getCurrentRate(((double)i/10)*100));
        }
    }

    public static String getCurrentRate(double rate) {
        StringBuffer currrentRate = new StringBuffer();
        for (int i = 0; i < rate; i++) {
            currrentRate.append("=");
        }
        return currrentRate.toString();
    }
}
