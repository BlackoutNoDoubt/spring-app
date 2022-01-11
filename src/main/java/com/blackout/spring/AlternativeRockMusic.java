package com.blackout.spring;

import org.springframework.stereotype.Component;

@Component
public class AlternativeRockMusic implements Music {
    @Override
    public String getSong() {
        return "The Killers - Somebody Told Me";
    }
}
