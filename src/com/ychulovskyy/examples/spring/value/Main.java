package com.ychulovskyy.examples.spring.value;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String ... args) {
        MyService service = new ClassPathXmlApplicationContext("myContext.xml").getBean("myService", MyService.class);
        System.out.println(service.generateMessage());
    }
}
