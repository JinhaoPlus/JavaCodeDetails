package com.rocking.test;

import java.util.Random;

class ParentClazz {
    static final int psfx = 1;

    static final int psfy = new Random().nextInt();

    static int psx = 1;

    static int psy = new Random().nextInt();

    static {
        System.out.println("static init parent");
    }

    int px;

    int py;

    {
        System.out.println("init parent block");
    }

    public ParentClazz() {
        System.out.println("init parent instance");
    }
}

class ChildClazz extends ParentClazz{

    static final int csfx = 1;

    static final int csfy = new Random().nextInt();

    static int csx = 2;

    static int csy = new Random().nextInt();

    static {
        System.out.println("static init child");
    }

    int cx;

    int cy;

    {
        System.out.println("init child block");
    }

    public ChildClazz() {
        System.out.println("init child instance");
    }

}


/**
 * 这是所有情况的类初始化顺序，如果实际类中没有定义则跳过：
 * 父类静态变量——父类静态代码块——子类静态代码块——父类非静态变量——父类非静态代码块——父类构造函数——子类非静态变量——子类非静态代码块——子类构造函数
 * 如果静态变量s是final的，若在编译期即可获得其值，那么只获取s时不需要对类初始化（因为获取的值从常量池获得）
 * 如果静态变量s是final的，若在运行时才可以获得其值，那么只获取s时需要对类初始化（因为获取的值从堆中获得）
 */
public class TestInitialize {
    public static void main(String[] args) {
//        System.out.println(ParentClazz.psfx);
//        System.out.println(ParentClazz.psfy);
//        System.out.println(ParentClazz.psx);
//        System.out.println(ParentClazz.psy);
//        ParentClazz instance = new ParentClazz();
        ParentClazz instance = new ChildClazz();
    }
}
