package ru.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import ru.project.interfaces.Music;

import java.util.ArrayList;
import java.util.List;

@Component// lesson 10 - annotations
public class MusicPlayer {
    private String name;
    private int volume;
    //@Autowired// lesson 11 - annotations
    //@Qualifier("classicalMusic") // lesson 11 - annotations
    private Music music;
    private Music music2;
    private List<Music> musicList = new ArrayList<>();

    // lesson 10 - DI
/*
    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;
    private RapMusic rapMusic;
*/
/*
    @Autowired// lesson 10 - DI. работает, так как указана однозначная зависимость
    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic, RapMusic rapMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
        this.rapMusic = rapMusic;
    }
*/

    // IoC
    @Autowired// lesson 10 - DI. не работает, тк указана неоднозначная зависимость,
    // но будет работать, если указать конкретные бины через @Qualifier
    // (3 бина вместо одного, тк все 3 класса реализуют интерфейс Music)
    public MusicPlayer(@Qualifier("classicalMusic") Music m1,
                       @Qualifier("rockMusic") Music m2) {
        this.music = m1;
        this.music2 = m2;
    }

    // lesson 6
    public MusicPlayer() {
    }

    // lesson 6
    public void setMusic(Music music) {
        this.music = music;
    }

    // lesson 6
    public void setName(String name) {
        this.name = name;
    }

    // lesson 6
    public void setVolume(int volume) {
        this.volume = volume;
    }

    // lesson 6
    public String getName() {
        return name;
    }

    // lesson 6
    public int getVolume() {
        return volume;
    }

    // lesson 6
    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    // lesson 6
    public List<Music> getMusicList() {
        return musicList;
    }

    public void playMusic() {
        System.out.println("PLAYING: " + music.getSong());
    }

    // lesson 10
/*
    public void playMusic1() {
        System.out.println("PLAYING: " + classicalMusic.getSong());
        System.out.println("PLAYING: " + rockMusic.getSong());
        System.out.println("PLAYING: " + rapMusic.getSong());
    }
*/

/*
    public String playMusic2() {
        return "PLAYING: " + classicalMusic.getSong();
    }
*/

    // lesson 11
    public String playMusic3() {
        return "PLAYING: " + music.getSong() + "\nnext: " + music2.getSong();
    }

    public void playMusicList() {
        /*for (Music music : musicList) {
            System.out.println("PLAYING: " + music.getSong());
        }*/
        musicList.forEach(music -> System.out.println("PLAYING: " + music.getSong()));
    }

    // lesson 8
    public void initialize() {
        System.out.println("MusicPlayer bean initialization");
    }

    // lesson 8
    public void destroy() {
        System.out.println("MusicPlayer bean destruction");
    }
}
