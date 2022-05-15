package ru.project.impl;

import org.springframework.stereotype.Component;
import ru.project.interfaces.Music;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music {
    private List<String> songs = new ArrayList<>();

    {
        songs.add("Wind cries Mary");
        songs.add("Paint it black");
        songs.add("Can't seem to make you mine");
    }

    @Override
    public String getSong() {
        return "Wind cries Mary";
    }

    @Override
    public List<String> getSongs() {
        return songs;
    }
}
