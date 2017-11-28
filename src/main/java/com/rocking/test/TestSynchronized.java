package com.rocking.test;

class MultiCrossClazz {

    public void syncMethod(String s) {
        int i = 1;
        while (i <= 100) {
            System.out.print(s);
            i++;
        }
    }

    public static void syncStaticMethod(String s) {
        int i = 1;
        while (i <= 100) {
            System.out.print(s);
            i++;
        }
    }
}

public class TestSynchronized {
    public static void main(String[] args) {
        MultiCrossClazz clazz1 = new MultiCrossClazz();
        MultiCrossClazz clazz2 = new MultiCrossClazz();
        new Thread(new Runnable() {
            @Override
            public void run() {
                clazz1.syncMethod("A");
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                clazz2.syncMethod("B");
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                clazz1.syncMethod("C");
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                MultiCrossClazz.syncStaticMethod("S");
            }
        }).start();
    }
}
