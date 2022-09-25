package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ExampleSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        Music music = context.getBean("musicBean", Music.class); // Эта строчка не нужна, так как в тексте программы мы не  будем обращаться к конкретному обьекту , Инициализация пройдет за кулисами.

        MusicPlayer player = context.getBean("musicPlayer", MusicPlayer.class); // стало, так как Spring сам запустил инициализацию и в конструкторе подстаил необходимый параметр
//        player.setMusic(music); - эта строка не нужна, так как  метод setMusic(Music music) запускается  из файла applucationContext.xml - строка  16, за кулисами.
        player.playMusic();
        System.out.println(player.getName());
        System.out.println(player.getVolume());
        context.close();
    }
}
