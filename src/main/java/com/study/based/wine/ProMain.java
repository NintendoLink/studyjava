package com.study.based.wine;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class ProMain {
    public static void main(String[] args) {
        MaoTaiJiu maoTaiJiu=new MaoTaiJiu();

        InvocationHandler jingxiao1=new GuiTaiA(maoTaiJiu);

        SellWine sellWine= (SellWine) Proxy.newProxyInstance(MaoTaiJiu.class.getClassLoader(),MaoTaiJiu.class.getInterfaces(),jingxiao1);

        sellWine.maijiu();
    }
}
