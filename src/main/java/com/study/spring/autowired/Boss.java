package com.study.spring.autowired;

import org.springframework.beans.factory.annotation.Autowired;

public class Boss {
    @Autowired
    private Car car;
    @Autowired
    private Office office;

    public Boss() {
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Office getOffice() {
        return office;
    }

    public void setOffice(Office office) {
        this.office = office;
    }

    @Override
    public String toString() {
        return "Boss{" +
                "car=" + car +
                ", office=" + office +
                '}';
    }
}
