package com.rocking.test;

public class TestIntrospector {
    public static void main(String[] args) {
        String bytecode = "00020001000000072AB400020460AC00000001000A000000060001000000060001000D00000002000E";
        String[] arr = bytecode.split("");
        for (int i = 0; i < arr.length; i = i + 2) {
            System.out.print(arr[i] + arr[i + 1] + ",");
        }
    }
}
