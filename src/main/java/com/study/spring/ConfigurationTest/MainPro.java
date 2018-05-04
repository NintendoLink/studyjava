package com.study.spring.ConfigurationTest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainPro {
    public static void main(String[] args) {
        ApplicationContext applicationContext= new AnnotationConfigApplicationContext(ServiceConfig.class);

        ServiceA serviceA=(ServiceA) applicationContext.getBean(ServiceA.class);

        System.out.println(serviceA.sayA());
    }
}
