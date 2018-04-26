package com.study.based.wine.common;

public class RealSubject implements Subject {
    @Override
    public void rent() {
        System.out.println("Hello rent");
    }

    @Override
    public void hello() {
        System.out.println("Hello hello");
    }
}
