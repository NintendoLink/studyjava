package com.study.spring.autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainPro {
    public static void main(String[] args) {
        String[] location={"bean.xml"};
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext(location);
        Boss boss=(Boss)applicationContext.getBean("boss");
        System.out.println(boss.toString());
    }
}
