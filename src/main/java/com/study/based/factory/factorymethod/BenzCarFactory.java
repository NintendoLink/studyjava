package com.study.based.factory.factorymethod;

public class BenzCarFactory implements Factory {
    @Override
    public Car createCar() {
        return new Benzcar();
    }
}
