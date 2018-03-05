package com.zw.stu.test;

public class Test02 {

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

    public void test02(int kk) {
        int i = 0;
        int j = 1;
        long jj = 1;
        for (int n = 0; n < 10; n++) {
            System.out.println();
        }
    }

    public static void main(String[] args) {

        float i = 0;
        float j = 1;
        System.out.println(j / i);
        Student res = test01();

        System.out.println(1.34567893245 > 1.345678932451);
        System.out.println(String.valueOf(res.name));
    }
}
