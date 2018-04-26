package com.study.based.proxy;

public class ProMain {
    public static void main(String[] args) {
        InteA inteA=new ClassA();

        ProxyClassA proxyClassA=new ProxyClassA(inteA);

        proxyClassA.show();
    }

}
