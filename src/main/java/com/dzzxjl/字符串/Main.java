package com.dzzxjl.字符串;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        // StringBuffer线程安全，但效率不高
        HashSet<StringBuilder> set = new HashSet<>();
        StringBuilder sb1 = new StringBuilder("aaa");
        StringBuilder sb2 = new StringBuilder("aaabbb");

        set.add(sb1);
        set.add(sb2);

        System.out.println(set);


        StringBuilder sb3 = sb1;
        sb3.append("bbb");

        System.out.println(set);
    }
}
