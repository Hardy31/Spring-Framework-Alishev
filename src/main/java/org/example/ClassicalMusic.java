package org.example;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("classicalMusic")
@Scope("singleton")
public class ClassicalMusic implements Music {

    public ClassicalMusic() {
        System.out.println("initialization ClassicalMusic");
    }

    @Override
    public String getSong() {
        return "Classical Music";
    }
}


