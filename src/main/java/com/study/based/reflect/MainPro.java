package com.study.based.reflect;

import java.lang.reflect.Method;

public class MainPro {
    public static void main(String[] args) throws Exception{
//        Person person=new Person();

        //三种获得class对象的方法，一般使用第三种Class.forName()
//        System.out.println(person.getClass());
//        System.out.println(Person.class);
//        System.out.println(Class.forName("Person"));;

//       一.构造方法测试
        Class clazz=Class.forName("com.study.based.reflect.Person");
        /**
         * 1.获得所有的共有的构造方法
         */
//        Constructor[] constructors=clazz.getConstructors();
//        for (Constructor constructor:constructors){
//            System.out.println(constructor);
//        }

        /**
         * 2.获得所有的构造方法(包括：共有，保护，私有，默认)
         */
//        Constructor[] constructors=clazz.getDeclaredConstructors();
//        for (Constructor constructor:constructors){
//            System.out.println(constructor);
//        }
        /**
         * 3.获得其他种类的构造方法
         */
//        ...............................

        /**
         * 4.获得构造方法，并调用
         */
//        无参构造方法创建对象
//        Constructor constructor=clazz.getConstructor(null);
//        Person person=(Person)constructor.newInstance();
//        System.out.println(person);

//        带参数的构造方法创建对象
//        Constructor constructor=clazz.getConstructor(String.class,Integer.class);
//        Person person=(Person)constructor.newInstance("张三",18);
//        System.out.println(person);

//        *********************************************************************************************************
//        二.成员变量测试
        /**
         * 1.获得所有的公有成员变量
         */

//        Field[] fields=clazz.getFields();
//        for(Field field:fields){
//            System.out.println(field);
//        }
        /**
         * 2.获得所有的成员变量(包括：共有，私有，受保护)
         */

//        Field[] fields=clazz.getDeclaredFields();
//        for(Field field:fields){
//            System.out.println(field);
//        }
        /**
         * 3.获得某个私有成员变量
         */
//        Field field=clazz.getDeclaredField("age");
//        System.out.println(field);

        /**
         * 4.获得某个私有成员变量。并且调用
         */
//        Field field=clazz.getDeclaredField("age");
//        System.out.println(field);
//
//        Person person=(Person) clazz.getConstructor().newInstance();
//        field.setAccessible(true);
//        field.set(person,18);
//
//        System.out.println(person);

        //        *********************************************************************************************************
//       三.成员方法测试
        /**
         *  1.获取公有成员(不包括私有的)方法
         */
//        Method[] methods=clazz.getMethods();
//        for(Method method: methods){
//            System.out.println(method);
//        }

        /**
         * 2.获取所有的成员方法，包括私有的(不包括继承的)
         */
//        Method[] methods =clazz.getDeclaredMethods();
//        for(Method method:methods){
//            System.out.println(method);
//        }
        /**
         * 3.获得单个的成员方法
         */
        Method method =clazz.getMethod("show", String.class);
        Person person=(Person)clazz.getConstructor().newInstance();
        method.invoke(person,"hehe");
    }
}
