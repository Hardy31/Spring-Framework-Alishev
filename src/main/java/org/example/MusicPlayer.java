package org.example;

public class MusicPlayer {
    private Music music;

    //IoC
    public MusicPlayer(Music music) {
        this.music = music;
        System.out.println("implement MusicPlayer");
    }

    public void playMusic(){
        System.out.println("Playing:" + music.getSong());
    }
}
