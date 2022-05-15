package ru.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Computer {
    private int id;
    private MusicPlayer player;

    @Autowired
    public Computer(MusicPlayer player) {
        this.id = 1;
        this.player = player;
    }

    @Override
    public String toString() {
        return "ru.project.Computer " + id + " " + player.playSong();
    }
}
