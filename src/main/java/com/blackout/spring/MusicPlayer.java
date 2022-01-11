package com.blackout.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

@Component
public class MusicPlayer {
    private ClassicalMusic classicalMusic;
    private AlternativeRockMusic alternativeRockMusic;
    private IndieMusic indieMusic;

    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, AlternativeRockMusic alternativeRockMusic, IndieMusic indieMusic) {
        this.classicalMusic = classicalMusic;
        this.alternativeRockMusic = alternativeRockMusic;
        this.indieMusic = indieMusic;
    }

    public void playMusic(MusicGenre genre) {
        Random random = new Random();
        int randomNumber = random.nextInt(3);

        if (genre == MusicGenre.CLASSICAL) {
            System.out.println(classicalMusic.getSongs().get(randomNumber));
        }
        else if (genre == MusicGenre.ALTERNATIVE_ROCK) {
            System.out.println(alternativeRockMusic.getSongs().get(randomNumber));
        }
        else {
            System.out.println(indieMusic.getSongs().get(randomNumber));
        }
    }
}
