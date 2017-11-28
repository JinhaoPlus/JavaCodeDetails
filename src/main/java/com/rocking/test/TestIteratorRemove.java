package com.rocking.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestIteratorRemove {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>() {{
            add("a");
            add("b");
            add("c");
            add("d");
        }};
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            if ("a".equals(iterator.next())) {
                iterator.remove();
            }
        }
        System.out.println(list);

        for (String l :
                list) {
            if ("d".equals(l)) {
                list.remove(l);
            }
        }

        System.out.println(list);
    }
}
