package com.study.based.fanxing;

public class FanXing<T> {
    private T t;

    public FanXing(T t) {
        this.t = t;
    }

    public FanXing() {
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
