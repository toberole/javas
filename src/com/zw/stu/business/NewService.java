package com.zw.stu.business;

import com.zw.stu.service.Service;

public class NewService implements Service {
    @Override
    public String getContent() {
        return "中共十九大";
    }
}
