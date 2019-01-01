package com.rocking.test;

interface III {
    int calc();
}

abstract class IIIA implements III {

}

public class TestInterfaceAbstarct {
    public static void main(String[] args) {
        System.out.println(IIIA.class);
    }
}
