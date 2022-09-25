package org.example;

public class MusicPlayer {


    private Music music;

    public MusicPlayer(Music music) {
        this.music = music;
        System.out.println("implement MusicPlayer - constructor with parameter");
    }

    public Music getMusic() {
        System.out.println("MusicPlayer.getMusic:" + music.getSong());
        return music;
    }


    public void playMusic(){
        System.out.println("MusicPlayer.playMusic:" + music.getSong());
    }


}
