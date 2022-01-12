package com.blackout.spring;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class IndieMusic implements Music {

    @Override
    public String getSong() {
        return "Interpol - All the Rage Back Home";
    }
}
