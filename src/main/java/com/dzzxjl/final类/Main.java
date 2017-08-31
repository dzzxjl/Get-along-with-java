package com.dzzxjl.final类;

final class Bean {
    int i = 7;
    final int j = 1;
    void f() {}
}

public class Main {
    public static void main(String[] args) {
        Bean bean = new Bean();
        System.out.println(bean.i);
//        bean.j++;
        System.out.println(bean.j);
//        System.out.println(bean.j++);
    }
}
