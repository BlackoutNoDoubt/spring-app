package com.blackout.spring;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class IndieMusic implements Music {
    private String songOne = "Interpol - All the Rage Back Home";
    private String songTwo = "Muzz - Bad Feeling";
    private String songThree = "Interpol - Take You on a Cruise";

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
