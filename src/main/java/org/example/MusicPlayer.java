package org.example;

public class MusicPlayer {


    private Music music;

//    //IoC
//    public MusicPlayer(Music music) {
//        this.music = music;
//        System.out.println("implement MusicPlayer");
//    }

    public MusicPlayer() {
        System.out.println("implement MusicPlayer - constructor without parameter");
    }
    public void playMusic(){
        System.out.println("MusicPlayer.playMusic:" + music.getSong());
    }

    public Music getMusic() {
        System.out.println("MusicPlayer.getMusic:" + music.getSong());
        return music;
    }

    public void setMusic(Music music) {
        System.out.println("MusicPlayer.setMusic:" + music.getSong());
        this.music = music;
    }
}
