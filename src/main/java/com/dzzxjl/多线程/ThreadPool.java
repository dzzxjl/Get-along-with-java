package com.dzzxjl.多线程;

import java.util.ArrayList;
import java.util.concurrent.*;


class TaskWithResult implements Callable<String> {
    private int id;

    public TaskWithResult(int id) {
        this.id = id;
    }

    @Override
    public String call() throws Exception {
        return "result of TaskWithResult " + id;
    }
}

public class ThreadPool {
    public static void main(String[] args) {
        // ThreadPoolExecutor是Executors的底层实现
//        ThreadPoolExecutor executor = new ThreadPoolExecutor();
        // Executors工厂中提供的方法只是帮助提前设定了一些参数
//        ExecutorService executorService = Executors.newFixedThreadPool(10);
//        executorService.submit(new YhyThread());

        ExecutorService executorService = Executors.newCachedThreadPool();
        ArrayList<Future<String>> results = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            results.add(executorService.submit(new TaskWithResult(i)));
        }

        for (Future<String> fs : results) {
            try {
                System.out.println(fs.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            } finally {
                executorService.shutdown();
            }
        }
    }
}
