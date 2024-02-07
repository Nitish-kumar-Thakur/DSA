package org.example;

public class Shadowing {
    static int a;
    static int b;
    static String name;

    public static void main(String[] args) {
        System.out.println(name);
        String name ="nitish";
        System.out.println(name);
        System.out.println(Shadowing.name);
    }

}
