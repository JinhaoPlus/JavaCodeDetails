package com.rocking.test;

public class TestFinallyReturn {
    public String test(){
        try{
            String ccc = "ccc";
            int x = 1/0;
            return ccc;
        }catch (Exception e){
            e.printStackTrace();
            throw e;
        }finally {
            System.out.println("IN FINALLY");
            return "ddd";
        }
    }

    public static void main(String[] args) {
        TestFinallyReturn testFinallyReturn = new TestFinallyReturn();
        System.out.println(testFinallyReturn.test());
    }
}
