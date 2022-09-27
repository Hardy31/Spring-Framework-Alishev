package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {

    @Autowired
    @Qualifier("classicalMusic")
    private Music music;

    public String playMusic(){
//       return  "MusicPlayer.playMusic:" + classicalMusic.getSong() + " and " + rockMusic.getSong();
       return  "MusicPlayer.playMusic:" + music.getSong() ;

    }
}
