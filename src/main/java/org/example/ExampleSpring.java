package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ExampleSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml" );
        ClassicalMusic classicalMusic = context.getBean("musicBean", ClassicalMusic.class);
        context.close();
    }
}
