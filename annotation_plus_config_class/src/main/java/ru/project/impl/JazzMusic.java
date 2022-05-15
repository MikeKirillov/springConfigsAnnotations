package ru.project.impl;

import ru.project.interfaces.Music;

import java.util.ArrayList;
import java.util.List;

public class JazzMusic implements Music {
    private List<String> songs = new ArrayList<>();

    {
        songs.add("So what");
        songs.add("Round midnight");
        songs.add("Fever");
    }

    @Override
    public String getSong() {
        return "Round midnight";
    }

    @Override
    public List<String> getSongs() {
        return songs;
    }
}
