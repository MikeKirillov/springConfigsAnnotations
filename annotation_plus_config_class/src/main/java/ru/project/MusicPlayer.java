package ru.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import ru.project.interfaces.Music;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//@Component // lesson 13 - commented to try manual configuration through config-class
public class MusicPlayer {
    @Value("${musicPlayer.name}")// lesson 12
    private String name;
    @Value("${musicPlayer.volume}")// lesson 12
    private int volume;

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    private Music music1;
    private Music music2;

    //@Autowired // lesson 13 - commented to try manual configuration through config-class
    public MusicPlayer(@Qualifier("classicalMusic") Music music1,
                       @Qualifier("rockMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    private List<Music> musicList;

    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }


    public String playSong() {
        return "PLAYING: " + music1.getSong() + "\nNEXT: " + music2.getSong();
    }

    public String playMusic() {
        Random random = new Random();

        return "PLAYING: " + musicList.get(random.nextInt(musicList.size())).getSong() + "\nVOLUME: " + getVolume();
    }
}
