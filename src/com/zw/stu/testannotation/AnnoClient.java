package com.zw.stu.testannotation;

import com.zw.stu.annotation.IName;
import com.zw.stu.bean.Student;

public class AnnoClient {
    public static void main(String[] args) {
        Student student = new Student();
        Class clazz = Student.class;
        if (clazz.isAnnotationPresent(IName.class)) {
            IName anno = (IName) clazz.getAnnotation(IName.class);
            String name = anno.value();
            int age = anno.age();

            System.out.println("name: " + name + " age: " + age);
        }
    }
}
