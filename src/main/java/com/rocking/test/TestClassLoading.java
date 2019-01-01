package com.rocking.test;

class CCC {

    static final String F_FIELD = "f-ccc";

    static String FIELD = "ccc";

    static {
        System.out.println("CCC init");
    }
}

public class TestClassLoading {
    public static void main(String[] args) {
        CCC[] cccs = new CCC[3];

        System.out.println("--------");

        System.out.println(CCC.F_FIELD);

        System.out.println("---------");

        System.out.println(CCC.FIELD);

        System.out.println("---------");

        CCC ccc = new CCC();
    }
}
