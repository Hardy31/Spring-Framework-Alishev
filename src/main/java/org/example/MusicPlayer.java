package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {


    private Music music;


    public MusicPlayer() {

        System.out.println("implement MusicPlayer - constructor without parameter");
    }
    @Autowired
    public void setMusic(Music music) {
        System.out.println("MusicPlayer - DI from setter" + this);
        this.music = music;
    }

    public void playMusic(){
        System.out.println("MusicPlayer.playMusic:" + music.getSong());
    }
}
