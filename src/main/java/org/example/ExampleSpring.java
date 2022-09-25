package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ExampleSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml" );
        MusicPlayer firstPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer secondPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        System.out.println(firstPlayer);
        System.out.println(secondPlayer);
        firstPlayer.setVolume(10);
        System.out.println(firstPlayer.getVolume());
        System.out.println(secondPlayer.getVolume());

        context.close();
    }
}
