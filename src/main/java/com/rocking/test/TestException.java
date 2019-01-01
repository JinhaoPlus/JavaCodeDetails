package com.rocking.test;

// 运行时异常不需要显式捕获
class MyRuntimeException extends RuntimeException {

}

// 受检异常需要显式捕获
class MyException extends Exception {

}

public class TestException {
    public static void main(String[] args) throws MyException {
        int i = 0;
        if (i == 0) {
            throw new MyRuntimeException();
        }
        if (i == 0) {
            throw new MyException();
        }
    }
}
