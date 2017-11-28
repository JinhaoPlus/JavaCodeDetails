package com.rocking.test;

import java.util.ArrayList;
import java.util.List;

public class TestSubList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        // 对原集合元素个数的修改，会导致子列表的遍历、增加、删除均会产生ConcurrentModificationException 异常
        List<String> subList = list.subList(0, 2);
//        list.remove(0);
        list.set(0, "sdsd");
        subList.add("eee");
        System.out.println(list);

    }
}
