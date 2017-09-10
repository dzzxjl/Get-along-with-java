package com.dzzxjl.JNITest;

public class Main {

    // 加载名为NativeMath的原生代码库
    static {
        System.loadLibrary("NativeMath");
    }
    // 原生方法与Java接口中的方法或抽象类中的抽象方法一样，只包含方法声明，没有实现
    public static native double sqrt(double value);


    public static void main(String[] args) {
        System.out.println(sqrt(4));
    }
}
