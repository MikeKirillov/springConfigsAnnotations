package ru.project;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
/*
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext1.xml");// alternative line to previous
*/
        // lesson 9+
        ClassPathXmlApplicationContext context2 = new ClassPathXmlApplicationContext(
                "applicationContext2.xml");

        // lesson 2
/*
        TestBean testBean = (TestBean) context.getBean("testBean");
        TestBean testBean1 = context.getBean("testBean", TestBean.class);// alternative line to previous

        System.out.println(testBean.getName());
        System.out.println(testBean1.getName());
*/

        // lesson 4 - IoC - inversion of control
/*
        Music bean = (Music) context.getBean("musicBean");
        System.out.println(bean.getSong());

        MusicPlayer musicPlayer = new MusicPlayer(bean);
        musicPlayer.playMusic();
*/

        // lesson 5-6 - DI - dependency injection
/*
        MusicPlayer musicPlayer = (MusicPlayer) context.getBean("musicPlayer");
        musicPlayer.playMusic();

        // lesson 6
        System.out.println("PLAYER NAME: " + musicPlayer.getName() + "\nVOLUME: " + musicPlayer.getVolume());
        musicPlayer.playMusicList();
*/

        // lesson 7 - Scope: prototype/singleton 
/*
        MusicPlayer firstPlayer = (MusicPlayer) context.getBean("musicPlayer");
        MusicPlayer secondPlayer = (MusicPlayer) context.getBean("musicPlayer");

        boolean comparison = firstPlayer == secondPlayer;// return TRUE if both at the same memory spot (not equals)
        System.out.println(comparison);
        // System.out.println(firstPlayer == secondPlayer);// alternate to previous string
        System.out.println(firstPlayer);// to check bean-object hash (memory spot)
        System.out.println(secondPlayer);// to check bean-object hash (memory spot)

        firstPlayer.setVolume(10);

        System.out.println(firstPlayer.getVolume());
        System.out.println(secondPlayer.getVolume());
*/

        // lesson 8 - init and destroy methods
/*
        ClassicalMusic classicalMusic = context.getBean("classicalMusicBean", ClassicalMusic.class);
        System.out.println(classicalMusic.getSong());
*/
/*
        MusicPlayer playerOne = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer playerTwo = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println(playerOne);
        System.out.println(playerTwo);
*/
        //context.close();

        // lesson 9 - using annotations - @Component
/*
        Music music = context2.getBean("classicalMusic", Music.class);
        MusicPlayer player = new MusicPlayer(music);
        player.playMusic();

        Music music1 = context2.getBean("rockMusic", Music.class);
        MusicPlayer player1 = new MusicPlayer(music1);
        player1.playMusic();
*/

        // lesson 10 - using annotations - @Autowired
/*
        //MusicPlayer musicPlayer = context2.getBean("musicPlayer", MusicPlayer.class);
        //musicPlayer.playMusic();// не работает, если указана неоднозначная зависимость для конструктора/поля/сеттера
        // (более 1го подходящего бина)
        //musicPlayer.playMusic1();

        Computer computer = context2.getBean("computer", Computer.class);
        System.out.println(computer);
*/

        // lesson 11 - using annotations - @Qualifier

        Computer computer = context2.getBean("computer", Computer.class);
        System.out.println(computer);
        context2.close();
    }
}
