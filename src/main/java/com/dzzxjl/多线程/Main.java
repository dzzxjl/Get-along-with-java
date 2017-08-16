package com.dzzxjl.多线程;

/*
目的：让test开始与结束不被打断
 */
class Sync {
    public void test (){
        synchronized(Sync.class) {
            System.out.println(Thread.currentThread() + "test开始");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread() + "test结束");
        }
    }
}
class SThread extends Thread {
    @Override
    public void run() {
        Sync sync = new Sync();
        sync.test();
    }
}

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            SThread sThread = new SThread();
            sThread.start();
        }
    }
}
