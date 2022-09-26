package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Computer {
    private int id;
    private MusicPlayer musicPlayer;

    @Autowired
    public Computer(MusicPlayer musicPlayer) {
        this.id = 1;
        this.musicPlayer = musicPlayer;
        System.out.println("initialization Computer with param");
    }

    @Override
    public String toString() {
        String result = "Computer{id=" + id + "; musicPlayer=" + this.musicPlayer.playMusic() + '}';
        return result;
    }
}
