package com.dzzxjl.字符串;

public class Test {
    public static String appendStr(String temp) {
        return temp + "bbb";
    }

    public static StringBuilder appendSb(StringBuilder sb) {
        return sb.append("bbb");

    }

    public static void main(String[] args) {
        String string = "aaa";
        String string1 = appendStr(string);
        System.out.println(string);

        StringBuilder stringBuilder = new StringBuilder("aaa");

        StringBuilder stringBuilder1 = appendSb(stringBuilder);
        System.out.println(stringBuilder);
    }
}
