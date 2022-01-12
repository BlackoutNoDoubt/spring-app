package com.blackout.spring;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope("prototype")
public class ClassicalMusic implements Music {

    @PostConstruct
    public void init() { System.out.println("Initialization completed."); }

    @PreDestroy
    public void destroy() { System.out.println("Destruction completed"); }

    @Override
    public String getSong() {
        return "Ludovico Einaudi - Experience";
    }
}