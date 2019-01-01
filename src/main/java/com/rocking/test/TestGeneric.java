package com.rocking.test;

class Couple<T> {
    T boy;
    T girl;

    public Couple(T boy, T girl) {
        this.boy = boy;
        this.girl = girl;
    }

    public void date() {
        System.out.println("A Date of " + boy + " and " + girl);
    }
}

class People<F> {
    private String name;
    private String gender;
    private Integer age;

    public People(String name, String gender, Integer age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return name;
    }

    public <T> void sayHello(T greeting) {
        System.out.println(greeting);
    }
}

public class TestGeneric {
    public static void main(String[] args) {
        Couple<People> couple
                = new Couple<>(new People("xiaoming", "m", 20), new People("xiaohong", "f", 20));
        couple.date();
        new People("xiaoming", "m", 20).sayHello("hi");
    }

}
