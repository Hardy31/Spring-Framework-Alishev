package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ExampleSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        FirstBean xBean = context.getBean("firstBean", FirstBean.class);
        System.out.println(xBean.getName());
    }
}
