package com.study.spring.example;

import org.springframework.stereotype.Component;

@Component
public class MessageServiceImpl implements MessageService {
    public String getMessage() {
        return "New Message";
    }
}
