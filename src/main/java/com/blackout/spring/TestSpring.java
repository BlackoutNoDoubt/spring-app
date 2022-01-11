package com.blackout.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

//        ClassicalMusic classicalMusic = context.getBean("musicBeanOne", ClassicalMusic.class);
//        System.out.println(classicalMusic.getSong());

        Music alternativeRockMusic = context.getBean("alternativeRockMusic", Music.class);
        MusicPlayer alternativeRockMusicPlayer = new MusicPlayer(alternativeRockMusic);

        Music indieMusic = context.getBean("indieMusic", Music.class);
        MusicPlayer indieMusicPlayer = new MusicPlayer(indieMusic);
//
//        MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//
        alternativeRockMusicPlayer.playMusic();
        indieMusicPlayer.playMusic();
//
//        System.out.println(musicPlayer.getName());
//        System.out.println(musicPlayer.getVolume());
//
//        System.out.println(".....");
//
//        firstMusicPlayer.playMusicList();

        context.close();
    }
}
