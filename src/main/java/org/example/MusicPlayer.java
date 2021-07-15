package org.example;

import lombok.Data;

@Data
public class MusicPlayer {
    private Music music;

    private String name;
    private int volume;

    public MusicPlayer(){}

    public MusicPlayer(Music music){
        this.music = music;
    }

    public void playMusic(){
        System.out.println("Playing: "+ music.getSong());
    }
}
