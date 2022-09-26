package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    private Music music;

    @Autowired
    public MusicPlayer(Music music) {
        this.music = music;
        System.out.println("implement MusicPlayer - constructor with parameter - " + this);
    }

    public void playMusic(){
        System.out.println("MusicPlayer.playMusic:" + music.getSong());
    }
}
