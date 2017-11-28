package com.rocking.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student> {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Student o) {
        return this.age > o.getAge() ? 1 : -1;
    }
}


public class TestCompare {
    public static void main(String[] args) {
        Student s1 = new Student("CCC", 10);
        Student s2 = new Student("DDD", 30);
        Student s3 = new Student("EEE", 20);
        List<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge() < o2.getAge() ? 1 : -1;
            }
        });
    }
}
