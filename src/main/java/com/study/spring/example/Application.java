package com.study.spring.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
/**
 * @Configuration
 * @ComponentScan
 * Spring官方实例
 */
public class Application {
    @Bean
    MessageService mockMessageService(){
        return new MessageService() {
            public String getMessage() {
                return "Hello Application";
            }
        };
    }

    public static void main(String[] args) {
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(Application.class);
        MessagePrinter messagePrinter=applicationContext.getBean(MessagePrinter.class);
        messagePrinter.printMeaage();
    }
}