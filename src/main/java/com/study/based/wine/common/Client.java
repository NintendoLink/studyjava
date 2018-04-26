package com.study.based.wine.common;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) {
        Subject realSubject=new RealSubject();

        InvocationHandler invocationHandler=new DynamicProxy(realSubject);

        Subject subject= (Subject) Proxy.newProxyInstance(invocationHandler.getClass().getClassLoader(),realSubject.getClass().getInterfaces(),invocationHandler);

        subject.rent();
        subject.hello();
    }
}
