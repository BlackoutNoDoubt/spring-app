package com.blackout.spring;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music {
    private ClassicalMusic() {}

    public static ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();
    }

    public void init() {
        System.out.println("Initialization completed.");
    }

    public void destroy() {
        System.out.println("Destruction completed.");
    }

    @Override
    public String getSong() {
        return "Ludovico Einaudi - Experience";
    }
}
