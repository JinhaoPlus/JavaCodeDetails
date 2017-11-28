package com.rocking.test;

import java.io.*;

class Person implements Serializable {
    private static final long serialVersionUID = -5809782578272943998L;
    private String name;
    private Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}

public class TestSerializable {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Person person = new Person("CCC", new Integer(20));
        ObjectOutputStream oo = new ObjectOutputStream(new FileOutputStream(new File("ser.txt")));
        oo.writeObject(person);
        oo.close();

        ObjectInputStream ii = new ObjectInputStream(new FileInputStream(new File("ser.txt")));
        Person person1 = (Person) ii.readObject();
        ii.close();

    }
}
