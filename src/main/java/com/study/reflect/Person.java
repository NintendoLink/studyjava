package com.study.reflect;

public class Person {
    private String name;
    private Integer age;


    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }


    private void show(){
        System.out.println("Hello private show");
    }

    public void show(String string){
        System.out.println("Hello public show");
    }
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
