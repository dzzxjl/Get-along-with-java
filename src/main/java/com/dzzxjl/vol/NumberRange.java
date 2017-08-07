package com.dzzxjl.vol;

public class NumberRange {
    private int min; // 在此添加volatile关键字无效
    private int max;

    public void setMin(int min) {
        this.min = min;
    }

    public void setMax(int max) {
        this.max = max;
    }

    synchronized public void changeMax(int temp) {
        if (temp > max){
            max = temp;
        }
    }

    @Override
    public String toString() {
        return min + " " + max;
    }

    public static NumberRange nr = new NumberRange();
    synchronized public void changeMin(int temp) {
        if (temp < min){
            min = temp;
        }
    }

    static class Thread1 implements Runnable {
        @Override
        public void run() {
            nr.setMin(4);
        }
    }
    static class Thread2 implements Runnable {
        @Override
        public void run() {
            nr.setMax(3);
        }
    }

    public static void main(String[] args) {
        nr.setMin(0);
        nr.setMax(5);
        System.out.println(nr);
        Thread thread = new Thread(new Thread1());
        Thread thread1 = new Thread(new Thread2());
        thread.start();
        thread1.start();
        System.out.println(nr);
    }
}
