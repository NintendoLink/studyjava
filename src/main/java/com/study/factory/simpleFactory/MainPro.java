package com.study.factory.simpleFactory;

public class MainPro {

    public static void main(String[] args) {
        CarFactory carFactory=new CarFactory();
        Car car=carFactory.getCar("BMW");
        System.out.println(car.run());
    }
}
