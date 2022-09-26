package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {


//    private Music music;
    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;

    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic) {
        System.out.println("implement MusicPlayer - constructor with parameter" + this);
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }

//    public void setMusic(Music music) {
//        System.out.println("MusicPlayer - DI from setter" + this);
//        this.music = music;
//    }

    public void playMusic(){
//        System.out.println("MusicPlayer.playMusic:" + music.getSong());
        System.out.println("MusicPlayer.playMusic:" + classicalMusic.getSong());
        System.out.println("MusicPlayer.playMusic:" + rockMusic.getSong());

    }
}
