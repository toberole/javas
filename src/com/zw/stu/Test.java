package com.zw.stu;
import java.util.concurrent.*;

public class Test {
    private static ExecutorService executor = Executors.newSingleThreadExecutor();
    public static void main(String[] args) {
        ExecutorService threadPool = Executors.newSingleThreadExecutor();
        Future<String> future = threadPool.submit(new Callable<String>() {
            public String call() throws Exception {
                Thread.sleep(2000);
                System.out.println("call()");
                return "Hello World";
            }
        });
        try {
            String s = future.get();
            System.out.println(s + "=========");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}