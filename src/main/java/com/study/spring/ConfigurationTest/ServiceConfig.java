package com.study.spring.ConfigurationTest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfig {

//    @Bean
//    ServiceA getServiceA(){
//        return new ServiceA() {
//            public String sayA() {
//                return "Hello A";
//            }
//        };
//    }
    @Bean
    ServiceA getServiceA(){
        return new ServiceImpl();
    }

    @Bean
    ServiceB getServiceB(){
        return new ServiceB() {
            public String sayB() {
                return "Hello B";
            }
        };
    }
}
