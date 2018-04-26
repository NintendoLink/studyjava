package com.study.based.fanxing;

public class Teacher implements Man {
    private String name;
    private Integer age;
    private Integer teacherId;

    @Override
    public void show() {
        System.out.println("teacherID:"+String.valueOf(teacherId));
    }

    public Teacher() {
    }

    public Teacher(String name, Integer age, Integer teacherId) {
        this.name = name;
        this.age = age;
        this.teacherId = teacherId;
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

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", teacherId=" + teacherId +
                '}';
    }
}
