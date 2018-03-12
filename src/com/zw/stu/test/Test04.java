package com.zw.stu.test;

import com.zw.stu.business.NewService;
import com.zw.stu.service.Router;
import com.zw.stu.service.Service;

public class Test04 {
    public static String serviceSimaple = null;

    public static void onCreate() {
        Service service = new NewService();

        Router.getInstance().addService(service);

        serviceSimaple = service.getClass().getSimpleName();


    }

    public static void main(String[] args) {
        onCreate();

        Service s = Router.getInstance().getService(serviceSimaple);
        System.out.println(s.getContent());
    }
}
