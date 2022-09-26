package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    private ClassicalMusic classicalMusic;

    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic) {
        this.classicalMusic = classicalMusic;
        System.out.println("implement MusicPlayer - constructor with parameter - " + this);
    }

    public void playMusic(){
        System.out.println("MusicPlayer.playMusic:" + classicalMusic.getSong());
    }
}
