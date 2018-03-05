package com.zw.stu;

import com.zw.stu.bean.Question;

import java.util.concurrent.*;

public class Test {
    private static ExecutorService executor = Executors.newSingleThreadExecutor();

    public static void main(String[] args) {
//        ExecutorService threadPool = Executors.newSingleThreadExecutor();
//        Future<String> future = threadPool.submit(new Callable<String>() {
//            public String call() throws Exception {
//                Thread.sleep(2000);
//                System.out.println("call()");
//                return "Hello World";
//            }
//        });
//        try {
//            String s = future.get();
//            System.out.println(s + "=========");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        String name = "xiao.ge.com";
//        int index = name.lastIndexOf(".");
//        String end = name.substring(index + 1);
//        System.out.println(index);
//        System.out.println(end);

//        Test t = new Test();
//        TT tt = t.new TT();
//        System.out.println(tt.getClass().getName());

        Question question = new Question("");
    }


    public class TT {

    }
}