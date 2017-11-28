package com.rocking.test;

class Parent {
    public String name= "PPP";
    public void sayHello() {
        System.out.println("P: Hello!");
    }

    public Parent() {
        System.out.println("CONSTRUCT PPP");
    }
}

class Child extends Parent {
    public String name= "CCC";

    @Override
    public void sayHello() {
        System.out.println("C: Hello!");
    }

    public void say(){
        System.out.println(this.name);
        System.out.println(super.name);
        this.sayHello();
        super.sayHello();
    }

    public Child() {
        super();
        System.out.println("CONSTRUCT CCC");
    }
}

public class TestSuper {
    public static void main(String[] args) {
        Child c = new Child();
        c.say();
    }
}
