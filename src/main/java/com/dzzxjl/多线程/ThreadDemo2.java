package com.dzzxjl.多线程;

class TThread implements Runnable {
    private int ticket = 5;

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            if (ticket > 0) {
                System.out.println(Thread.currentThread() + "  " + ticket--);
            }

        }
    }
}


public class ThreadDemo2 {
    public static void main(String[] args) {
        TThread tThread = new TThread();
        new Thread(tThread).start();
        new Thread(tThread).start();
        new Thread(tThread).start();

    }
}
