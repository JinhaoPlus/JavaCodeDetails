package com.rocking.test;

public class TestStatic {
    /**
     * @param args
     */
    public static void main(String[] args) {
//        System.out.println(FinalStatic.A);
//        System.out.println(FinalStatic.B);
//        System.out.println("==============");
//        FinalStatic.method();
        System.out.println(Father.C);
        System.out.println(FinalStatic.A);
        System.out.println(FinalStatic.B);
        System.out.println(Father.D);
        FinalStatic sss = new FinalStatic();
    }
}

class FinalStatic extends Father {

    public static final int A = 4 + 4;

    public static int B = 4 + 4;

    public static void method() {
        System.out.println("STATIC METHOD");
    }

    static {
        System.out.println("FinalStatic Static");
    }

    {
        System.out.println("FinalStatic Block");
    }

    public FinalStatic() {
        System.out.println("FinalStatic");
    }
}

class Father {
    public static final int C = 4 + 4;

    public static int D = 4 + 4;

    static {
        System.out.println("Father Static");
    }

    {
        System.out.println("Father Block");
    }

    public Father() {
        System.out.println("Father");
    }
}