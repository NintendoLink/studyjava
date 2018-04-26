package com.study.factory.factorymethod;

public class MainPro {
    public static void main(String[] args) {
        Car car=new BenzCarFactory().createCar();
        System.out.println(car.run());
    }
}
