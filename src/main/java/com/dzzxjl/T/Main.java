package com.dzzxjl.T;

public class Main {



    public static <T> void test(T a) {
        System.out.println(a.getClass());
    }
    public static void main(String[] args) {
        test(1);
        test(true);
        test(9L);
        test(new int[]{1,2});

    }
}
