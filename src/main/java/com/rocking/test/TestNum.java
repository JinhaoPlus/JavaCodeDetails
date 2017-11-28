package com.rocking.test;

public class TestNum {
    public static void main(String[] args) {
        System.out.println(3 * 0.1);
        System.out.println(3 * 0.1 == 0.3);
        float f = 3.4F;
        double d = 3.4D;
        short s1 = 1;
        s1 = (short) (s1 + 1);
        System.out.println(f == d);

        int x = 1000;
        long y = 1000L;
        System.out.println(x == y);

    }
}
