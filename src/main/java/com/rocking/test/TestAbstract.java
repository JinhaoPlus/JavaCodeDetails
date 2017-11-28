package com.rocking.test;

interface SomeInterFace{
}

class ConcreteClazz{
    public ConcreteClazz() {
        System.out.println("CONCRETE CONSTRUCT");
    }
}

abstract class SomeAbstractClazz extends ConcreteClazz implements SomeInterFace{
    SomeAbstractClazz(){
        System.out.println("ABSTRACT CONSTRUCT");
    }
}

class SomeClazz extends SomeAbstractClazz{
    public SomeClazz() {
        System.out.println("SOME CONSTRUCT");
    }
}

public class TestAbstract {
    public static void main(String[] args) {
        SomeClazz someClazz = new SomeClazz();
        someClazz = (SomeClazz) new ConcreteClazz();
    }
}
