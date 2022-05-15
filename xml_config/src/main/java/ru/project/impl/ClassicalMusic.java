package ru.project.impl;

import org.springframework.stereotype.Component;
import ru.project.interfaces.Music;

@Component("classicalMusic")// lesson 9 - annotations
public class ClassicalMusic implements Music {
    private ClassicalMusic() {
    } // lesson 8 -- to restrict object creating via "new"-keyword

    public static ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();
    } // lesson 8 -- this is how to create class object

    public void doMyInit() {
        System.out.println("ClassicalMusic bean initialization");
    }

    public void doMyDestroy() {
        System.out.println("ClassicalMusic bean destruction");
    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
