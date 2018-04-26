package com.study.factory.factorymethod;

public class AudiCarFactory implements Factory {
    @Override
    public Car createCar() {
        return new AudiCar();
    }
}
