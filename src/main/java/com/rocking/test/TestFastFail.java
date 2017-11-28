package com.rocking.test;

import java.util.*;

public class TestFastFail {


    public static void main(String[] args) {
//        ConcurrentHashMap<String, String> premiumPhone =
//                new ConcurrentHashMap<String, String>();
//        premiumPhone.put("Apple", "iPhone");
//        premiumPhone.put("HTC", "HTC one");
//        premiumPhone.put("Samsung", "S5");
//
//        Iterator iterator = premiumPhone.keySet().iterator();
//
//        while (iterator.hasNext()) {
//            System.out.println(premiumPhone.get(iterator.next()));
//            premiumPhone.put("Sony", "Xperia Z");
//        }

        HashMap<String, String> premiumPhone =
                new HashMap<String, String>();
        premiumPhone.put("Apple", "iPhone");
        premiumPhone.put("HTC", "HTC one");
        premiumPhone.put("Samsung", "S5");

        Iterator<String> iterator = premiumPhone.keySet().iterator();

        List<Map.Entry<String, String>> list = new ArrayList<>(premiumPhone.entrySet());

        System.out.println(list);

        Collections.sort(list, new Comparator<Map.Entry<String, String>>() {

            @Override
            public int compare(Map.Entry<String, String> o1, Map.Entry<String, String> o2) {
                if (o1.getKey().length() > o2.getKey().length()) {
                    return 1;
                } else {
                    return -1;
                }
            }
        });

        System.out.println(list);

//        while (iterator.hasNext()) {
//            String key = iterator.next();
////            premiumPhone.put("Sony", "Xperia Z");
//            if (key.equals("HTC")) {
//                iterator.remove();
//                continue;
//            }
//            System.out.println(premiumPhone.get(key));
//        }
//
//        System.out.println(premiumPhone);
    }

}