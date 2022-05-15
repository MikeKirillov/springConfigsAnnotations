package ru.project.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import ru.project.Computer;
import ru.project.MusicPlayer;
import ru.project.impl.ClassicalMusic;
import ru.project.impl.JazzMusic;
import ru.project.impl.RockMusic;
import ru.project.interfaces.Music;

import java.util.Arrays;
import java.util.List;

@Configuration
//@ComponentScan("ru.project") // lesson 13 - commented to try manual configuration through config-class instead automated
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
    // lesson 13 - trying manual configurations below

    @Bean
    public ClassicalMusic classicalMusic() {
        return new ClassicalMusic();
    }

    @Bean
    public RockMusic rockMusic() {
        return new RockMusic();
    }

    @Bean
    public JazzMusic jazzMusic() {
        return new JazzMusic();
    }

    @Bean
    public List<Music> musicList() {
        return Arrays.asList(classicalMusic(), rockMusic(), jazzMusic());
    }

    @Bean
    public MusicPlayer musicPlayer() {
        //return new MusicPlayer(classicalMusic(), rockMusic());
        return new MusicPlayer(musicList());
    }

    @Bean
    public Computer computer() {
        return new Computer(musicPlayer());
    }
}
