package com.rocking.test;

import java.util.ArrayList;
import java.util.List;

public class TestValuePass {
    public static void main(String[] args) {
        List<List<String>> fatherList = new ArrayList<>();
        List<String> childList = new ArrayList<>();
        childList.add("before add child list");
        fatherList.add(childList);
        childList.add("after add child list");
        System.out.println(fatherList);

        String s1 = "hello";
        String s2 = "world";
        System.out.println(s1 + "---" + s2);
        change(s1, s2);
        System.out.println(s1 + "---" + s2);

        StringBuffer sb1 = new StringBuffer("hello");
        StringBuffer sb2 = new StringBuffer("world");
        System.out.println(sb1 + "---" + sb2);
        change(sb1, sb2);
        System.out.println(sb1 + "---" + sb2);
    }

    public static void change(StringBuffer sb1, StringBuffer sb2) {
        sb1 = sb2;
        sb2.append(sb1);
    }

    public static void change(String s1, String s2) {
        s1 = s2;
        s2 = s1 + s2;
    }
}
