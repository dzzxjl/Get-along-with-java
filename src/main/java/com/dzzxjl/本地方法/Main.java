package com.dzzxjl.本地方法;

public class Main {
    public static void main(String[] args) {
        String string1 = "helloworld";
        System.out.println(string1.hashCode());

        String string2 = "helloworld";
        System.out.println(string2.hashCode());
        System.out.println(string2.intern().hashCode());
    }
}
