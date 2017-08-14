package com.dzzxjl.多线程;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;


class YhyThread implements Runnable {
    @Override
    public void run() {
        System.out.println("this is yhythread");
    }
}

public class ThreadPool {
    public static void main(String[] args) {
        // ThreadPoolExecutor是Executors的底层实现
//        ThreadPoolExecutor executor = new ThreadPoolExecutor();
        // Executors工厂中提供的方法只是帮助提前设定了一些参数
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        executorService.submit(new YhyThread());

        //        ThreadPoolExecutor
    }
}
