package ru.project.impl;

import org.springframework.stereotype.Component;
import ru.project.interfaces.Music;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;

//@Component("classicalMusic") // lesson 13 - commented to try manual configuration through config-class
//@Scope("prototype")// lesson 12 - singleton / prototype /etc.
public class ClassicalMusic implements Music {
    private List<String> songs = new ArrayList<>();

    {
        songs.add("Hungarian Rhapsody");
        songs.add("Symphony no. 5 in C Minor, op. 67");
        songs.add("Night on Bald Mountain");
    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }

    @Override
    public List<String> getSongs() {
        return songs;
    }

    @PostConstruct
    public void doMyInit() {
        System.out.println("initialization");
    }

    @PreDestroy
    public void doMyDestroy() {
        System.out.println("destruction");
    }
}
