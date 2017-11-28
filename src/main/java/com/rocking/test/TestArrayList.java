package com.rocking.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestArrayList {
    public static void main(String[] args) {
        String[] array = new String[]{"a", "b", "c"};
        List<String> list = Arrays.asList(array);
        System.out.println(list);
//        list.add("d");
        array[0] = "e";
        System.out.println(list);


        List<String> stringList = new ArrayList<String>() {{
            add("a");
            add("b");
            add("c");
            add("d");
        }};
        String[] arr = new String[stringList.size()];
        System.out.println(stringList.toArray());
        System.out.println(stringList.toArray(arr));
    }
}
