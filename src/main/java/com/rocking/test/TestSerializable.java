package com.rocking.test;

import java.io.*;

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
