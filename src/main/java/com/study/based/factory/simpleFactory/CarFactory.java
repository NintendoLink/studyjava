package com.study.based.factory.simpleFactory;

public class CarFactory {
    public Car getCar(String carName){
        if (carName.equals("Benz")){
            return new BenzCar();
        }else if (carName.equals("Audi")){
            return new AudiCar();
        }else if (carName.equals("BMW")){
            return new BMWCar();
        }
        return null;
    }
}
