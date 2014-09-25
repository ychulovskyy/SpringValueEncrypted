package com.ychulovskyy.examples.spring.value;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MyService {

    @Value("${message}")
    private String message;

    @Value("${password}")
    private String password;

    public String generateMessage() {
        return message + " " + password;
    }
}
