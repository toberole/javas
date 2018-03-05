package com.zw.stu;

public class Init extends ThreadGroup {
    public Init(String name) {
        super(name);
    }

    @Override
    public void uncaughtException(Thread t, Throwable e) {
        TestException ee = (TestException) e;
        ee.printSys();
    }

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("RuntimeException ThreadID: " + Thread.currentThread().getId());
                TestException e = new TestException();
                throw e;
            }
        }).start();
    }
}
