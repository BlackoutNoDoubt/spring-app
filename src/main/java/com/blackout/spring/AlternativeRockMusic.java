package com.blackout.spring;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class AlternativeRockMusic implements Music {
    private String songOne = "The Killers - Somebody Told Me";
    private String songTwo = "The Killers - Be Still";
    private String songThree = "The Killers - Dying Breed";

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
