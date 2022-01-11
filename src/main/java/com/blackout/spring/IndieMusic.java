package com.blackout.spring;

import org.springframework.stereotype.Component;

@Component
public class IndieMusic implements Music {
    @Override
    public String getSong() {
        return "Interpol - All the Rage Back Home";
    }
}
