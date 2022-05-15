package ru.project;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.project.enums.Genres;
import ru.project.impl.ClassicalMusic;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");

        //ru.project.MusicPlayer player = context.getBean("musicPlayer", ru.project.MusicPlayer.class);
        //System.out.println(player.playSong());

        //ru.project.Computer computer = context.getBean("computer", ru.project.Computer.class);
        //System.out.println(computer);

        //MusicPlayer player = context.getBean("musicPlayer", MusicPlayer.class);
        //player.playMusic(Genres.CLASSICAL);
        //player.playMusic(Genres.ROCK);

        // lesson 12
        MusicPlayer player = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println(player.getName());
        System.out.println(player.getVolume());

        ClassicalMusic classicalMusic1 = context.getBean("classicalMusic", ClassicalMusic.class);
        //ClassicalMusic classicalMusic2 = context.getBean("classicalMusic", ClassicalMusic.class);

        //System.out.println(classicalMusic1 == classicalMusic2);

        //Computer computer = context.getBean("computer", Computer.class);
        //System.out.println(computer);

        context.close();
    }
}
