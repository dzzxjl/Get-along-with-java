package com.dzzxjl.syn;

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
        Thread1 thread = new Thread1();
        Thread thread1 = new Thread(thread, "A");
        Thread thread2 = new Thread(thread, "B");
        thread1.start();
        thread2.start();
    }
}
