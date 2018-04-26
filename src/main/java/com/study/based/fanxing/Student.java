package com.study.based.fanxing;

public class Student implements Man {
    private String name;
    private Integer age;
    private Integer studentId;

    @Override
    public void show() {
        System.out.println("studentID:"+String.valueOf(studentId));
    }

    public Student(String name, Integer age, Integer studentId) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
    }

    public Student() {
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

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", studentId=" + studentId +
                '}';
    }
}
