package com.dzzxjl.多线程;

class TicketThread extends Thread{
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

public class ThreadDemo {
    public static void main(String[] args) {
        new TicketThread().start();
        new TicketThread().start();
        new TicketThread().start();
    }
}
