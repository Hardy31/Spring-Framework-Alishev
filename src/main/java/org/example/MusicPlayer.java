package org.example;

public class MusicPlayer {


    private Music music;
    private String name;
    private int volume;

    public MusicPlayer() {
        System.out.println("implement MusicPlayer - constructor without parameter");
    }

    public Music getMusic() {
        System.out.println("MusicPlayer.getMusic:" + music.getSong());
        return music;
    }

    public void setMusic(Music music) {
        System.out.println("MusicPlayer.setMusic:" + music.getSong());
        this.music = music;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("MusicPlayer.setName:" + this.name);
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("MusicPlayer.setVolume:" + this.volume);
    }

    public void playMusic(){
        System.out.println("MusicPlayer.playMusic:" + music.getSong());
    }


}
