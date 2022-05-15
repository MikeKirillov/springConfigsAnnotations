package ru.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import ru.project.enums.Genres;
import ru.project.interfaces.Music;

import java.util.Random;

@Component
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

    @Autowired
    public MusicPlayer(@Qualifier("classicalMusic") Music music1,
                       @Qualifier("rockMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    public String playSong() {
        return "PLAYING: " + music1.getSong() + "\nnext: " + music2.getSong();
    }

    public void playMusic(Genres genre) {
        Random random = new Random();
        int randNum = random.nextInt(3);// генерим случайное число 1-3 под индекс в списке из 3 значений

        switch (genre) {
            case ROCK -> System.out.println("PLAYING CLASSIC: " + music1.getSongs().get(randNum));
            case CLASSICAL -> System.out.println("PLAYING ROCK: " + music2.getSongs().get(randNum));
            default -> System.out.println("Unexpected genre");
        }
    }
}
