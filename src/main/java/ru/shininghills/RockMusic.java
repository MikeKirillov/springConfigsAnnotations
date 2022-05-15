package ru.shininghills;

import org.springframework.stereotype.Component;

@Component// lesson 9 - annotations
public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Wind cries Mary";
    }
}
