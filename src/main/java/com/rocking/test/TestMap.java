package com.rocking.test;

import java.util.HashMap;
import java.util.Map;

public class TestMap {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
//        map.put(null, "0");
//        map.put(null, "1");
//        map.put(null, "2");
        map.put("ccc","Jinhao");
        map.put("ccc","CCC");
        System.out.println(map);

//        Map<String, String> concurrentHashMap = new ConcurrentHashMap<>();
//        concurrentHashMap.put(null, "0");
//        concurrentHashMap.put(null, "1");
//        concurrentHashMap.put(null, "2");
//        System.out.println(concurrentHashMap);
    }
}
