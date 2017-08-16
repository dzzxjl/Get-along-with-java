package com.dzzxjl.多线程;

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("我是继承来的thread，不过只能单继承");
//        wait();
    }
}

public class Thread1 implements Runnable{
    @Override
    public void run() {
        synchronized (this) {
            for (int i = 0; i < 5;i++) {
                System.out.println(Thread.currentThread().getName() + i);
            }
        }
    }

    public static void main(String[] args) {
        MyThread myThread = new MyThread();

    }
}
