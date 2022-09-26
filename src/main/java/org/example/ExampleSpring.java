package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ExampleSpring {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml" );

        Computer computer = context.getBean("computer", Computer.class);
        System.out.println(computer.toString());

        context.close();
    }
}
