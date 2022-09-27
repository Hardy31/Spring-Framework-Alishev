package org.example;

import org.springframework.stereotype.Component;

@Component("classicalMusic")
public class ClassicalMusic implements Music {

    public ClassicalMusic() {
        System.out.println("initialization ClassicalMusic");
    }

    @Override
    public String getSong() {
        return "Classical Music";
    }
}


