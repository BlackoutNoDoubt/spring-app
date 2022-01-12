package com.blackout.spring;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class AlternativeRockMusic implements Music {

    @Override
    public String getSong() {
        return "The Killers - Somebody Told Me";
    }
}
