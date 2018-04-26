package com.study.based.wine;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class GuiTaiA implements InvocationHandler {
    private Object pinpai;

    public GuiTaiA(Object pinpai) {
        this.pinpai = pinpai;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            method.invoke(pinpai,args);
            return null;
    }
}
