package com.rocking.test;

public class TestString {

    public static void main(String[] args) {
        Integer x = 12899;
        Integer y = 12899;
        System.out.println(x == y);
        String s1 = "123";
        System.out.println(s1);
        String s2 = "123";
        System.out.println(s2);

        System.out.println(s2 == s1);
        System.out.println();

        StringBuffer buffer = new StringBuffer();
        Long t1 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            buffer.append("XXX");
        }
        Long t2 = System.currentTimeMillis();
        System.out.println(t2 - t1);

        StringBuilder builder = new StringBuilder();
        Long t3 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            builder.append("XXX");
        }
        Long t4 = System.currentTimeMillis();
        System.out.println(t4 - t3);
    }
}
