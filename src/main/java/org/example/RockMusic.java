package org.example;

import org.springframework.stereotype.Component;

@Component("songRockMusic")
public class RockMusic implements Music{

    public RockMusic() {
        System.out.println("initialization Rock Music");
    }

    @Override
    public String getSong() {
        return "Rock Music";
    }
}
