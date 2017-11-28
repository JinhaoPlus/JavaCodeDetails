package com.rocking.test;

import java.util.*;

class StrangeElement {

    @Override
    public boolean equals(Object obj) {
        return this.hashCode() == obj.hashCode();
    }

    @Override
    public int hashCode() {
        return 111;
    }
}

public class TestSet {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>() {{
            add("a");
            add("a");
            add("b");
            add("c");
        }};
        Set set = new HashSet(list);
        System.out.println(set);

        HashSet<StrangeElement> strangeSet = new HashSet<>();
        strangeSet.add(new StrangeElement());
        strangeSet.add(new StrangeElement());
        strangeSet.add(new StrangeElement());
        System.out.println(strangeSet);

        HashMap<StrangeElement, Object> map = new HashMap<>();
        map.put(new StrangeElement(), 1);
        map.put(new StrangeElement(), 2);
        map.put(new StrangeElement(), 3);
        System.out.println(map);
    }
}
