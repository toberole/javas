package com.zw.stu.test;

@TestAnno
public class Test03 extends Base implements TestInterface {
    private int age;
    private int age11;

    public Test03(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        System.out.println((new Test03(88)).hashCode());
    }

    public int test01() {
        int age = 11;
        //String name = "TOM";

        return 1;
    }

    public void test02(int i) {
        switch (i) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
    }

    private Object lock = new Object();

    public void test03() {
        try {
            synchronized (lock) {
                int j = 0;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("echo");
        }
    }

    public void test04() {
        int arr[] = new int[10];
        int i = arr[0];
    }

    public <T> T test5() {
        int 年龄 = 100;
        return (T) new Student();
    }

    @Override
    public void hello() {

    }
}
