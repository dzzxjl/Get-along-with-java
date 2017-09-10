package com.dzzxjl.函数式编程;

public class Main {
    public static void main(String[] args) {
//        (int x) -> {
//            return x * 10;
//        }

//        new Thread(() -> {System.out.println("hello world");}).start();
//
//        Runnable r = () -> {
//            System.out.println("我的目标是输出一个Runnable对象");
//        };

        String str = "Hello";
        new Thread(() -> {
            // 不允许在此声明str
//           String str = "World"; // lambda表达式的方法体并没有引入新的作用域
            System.out.println();
        });


    }
}
