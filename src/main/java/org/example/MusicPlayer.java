package org.example;

public class MusicPlayer {


    private Music music;

//    //IoC
//    public MusicPlayer(Music music) {
//        this.music = music;
//        System.out.println("implement MusicPlayer");
//    }

    public MusicPlayer() {
    }

    public void playMusic(){
        System.out.println("Playing:" + music.getSong());
    }

    public Music getMusic() {
        return music;
    }

    public void setMusic(Music music) {
        this.music = music;
    }
}
