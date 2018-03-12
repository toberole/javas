package com.zw.stu.test;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class Test02 {
    public static String str = "hello world";

    public String name = "Tom";

    public int age = 11;

    public static int age11 = 11;

    public static void main(String[] args) {
        float i = 0;
        float j = 1;

        int iji = (int) j;

        System.out.println(j / i);
        Student res = test01();

        System.out.println(3 | 4);

        System.out.println(1.34567893245 > 1.345678932451);
        System.out.println(String.valueOf(res.name));

        Map<String,Integer> map = new HashMap<>(10);
        map = new WeakHashMap<>();

        System.out.println(1 << 30);
    }

    public Test02() {

    }

    public static String test() {
        boolean b = true;
        String res = null;
        try {
            res = "hello";
            return res;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            res = "world";
            return res;
        }

        // return res;
    }

    public static Student test01() {
        Student student = new Student();

        try {
            student.name = "hello";
            return student;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            student.name = "world";
            // return student;
        }

        return student;
    }

    public synchronized void test03() {
        int i = 0;
        int j = 1;
        int k = i + j;
        System.out.println(k);
    }

    public final Object object = new Object();

    public void test04() {
        synchronized (object) {
            Student student = new Student();
            int[] arr = new int[10];
            int i = 0;
            int j = 1;
            short iji = (short) i;
            boolean b = i > j;
            int n = age11;
            int k = i + j;
            int kk = i / j;
            System.out.println(k);
        }

        return;
    }

    public void test05() {
        synchronized (object) {
            int i = 0;
            int j = 1;
        }
    }

    public int test06() {
        // Class clazz = Test02.class;

        for (int i = 0; i < 100; i++) {

        }
        test05();

        int j = 22;

        return j;
    }
}
