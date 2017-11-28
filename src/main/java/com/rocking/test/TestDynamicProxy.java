package com.rocking.test;

import java.lang.reflect.Proxy;

interface ICal {
    void add();

    void cal();
}

class Cal implements ICal {

    public void add() {
        System.out.println("ADD...");
    }

    public void cal() {
        System.out.println("CAL...");
    }
}


public class TestDynamicProxy {
    public static void main(String[] args) {
        ICal cal = new Cal();
        ICal proxyCal = (ICal) Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), cal.getClass().getInterfaces(),
            (proxy, method, margs) -> {
                System.out.println("START...");
                Object result = method.invoke(cal, margs);
                System.out.println("END...");
                return result;
            });
        proxyCal.cal();
        proxyCal.add();
    }

}
