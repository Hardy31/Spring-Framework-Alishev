package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ExampleSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        Music music = context.getBean("musicBean", Music.class); Эта строчка не нужна, так как в тексте программы мы не  будем обращаться к конкретному обьекту , Инициализация пройдет за кулисами.
//        MusicPlayer player = new MusicPlayer(music); - было
        MusicPlayer player = context.getBean("musicPlayer", MusicPlayer.class); // стало, так как Spring сам запустил инициализацию и в конструкторе подстаил необходимый параметр
        player.playMusic();
        context.close();
    }
}
