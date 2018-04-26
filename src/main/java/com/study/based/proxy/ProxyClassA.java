package com.study.based.proxy;

public class ProxyClassA implements InteA {
    private InteA inteA;

    public ProxyClassA(InteA inteA) {
        this.inteA = inteA;
    }

    @Override
    public void show() {
        System.out.println("Hello ClassB");
        inteA.show();
    }
}
