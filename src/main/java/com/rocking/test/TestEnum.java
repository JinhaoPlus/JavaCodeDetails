package com.rocking.test;

enum Light {
    RED(1),
    GREEN(2),
    YELLOW(3);

    private int color;

    Light(int color) {
        this.color = color;
    }
}

public class TestEnum {
    public static void main(String[] args) {
        Light light = Light.RED;
        switch (light) {
            case RED:
                System.out.println("RED");
                break;
            case GREEN:
                System.out.println("GREEN");
                break;
            case YELLOW:
                System.out.println("YELLO");
                break;
            default:
                System.out.println("DEFAULT");
        }
        Integer xxx = 10000;
        Integer yyy = 10000;
        System.out.println(xxx == yyy);
    }
}
