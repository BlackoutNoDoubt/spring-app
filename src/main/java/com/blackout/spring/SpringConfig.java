package com.blackout.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Configuration
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
    @Bean
    public ClassicalMusic classicalMusic() {
        return new ClassicalMusic();
    }

    @Bean
    public AlternativeRockMusic alternativeRockMusic() {
        return new AlternativeRockMusic();
    }

    @Bean
    public IndieMusic indieMusic() {
        return new IndieMusic();
    }

    @Bean
    public MusicPlayer musicPlayer() {
        return new MusicPlayer(musicList());
    }

    @Bean
    public Computer computer() {
        return new Computer(musicPlayer());
    }

    @Bean
    public List<Music> musicList() {
        return Arrays.asList(classicalMusic(), alternativeRockMusic(), indieMusic());
    }
}
