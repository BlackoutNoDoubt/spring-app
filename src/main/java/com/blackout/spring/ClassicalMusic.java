package com.blackout.spring;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music {
    private String songOne = "Ludovico Einaudi - Experience";
    private String songTwo = "Tchaikovsky - The Nutcracker";
    private String songThree = "Chopin - Nocturne No.1";

    private List<String> classicalList = new ArrayList<>();

    {
        classicalList.add(songOne);
        classicalList.add(songTwo);
        classicalList.add(songThree);
    }

    @Override
    public List<String> getSongs() {
        return classicalList;
    }
}
