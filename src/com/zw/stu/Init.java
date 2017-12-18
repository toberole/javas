package com.zw.stu;

public class Init {
    public static void main(String[] args) {
        try {
            Class.forName(Test.class.getName()).newInstance();

            System.out.print("hello world");

            new Thread(new Runnable() {
                @Override
                public void run() {
                    throw new RuntimeException("我是一个异常");
                }
            }).start();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
