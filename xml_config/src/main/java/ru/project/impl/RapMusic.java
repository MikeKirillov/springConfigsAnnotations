package ru.project.impl;

import org.springframework.stereotype.Component;
import ru.project.interfaces.Music;

@Component// lesson 9 - annotations
public class RapMusic implements Music {
    @Override
    public String getSong() {
        return "Superman";
    }
}
