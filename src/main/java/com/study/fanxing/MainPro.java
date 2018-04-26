package com.study.fanxing;

public class MainPro {
    public static void main(String[] args) {
        Student student=new Student("张三",18,1);
        FanXing<Student> fanXing=new FanXing();
        fanXing.setT(student);
        System.out.println(fanXing.getT().toString());
    }
}
