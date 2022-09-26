package org.example;

import org.springframework.stereotype.Component;

@Component("songRockMusic")
public class RockMusic implements Music{

    public RockMusic() {
        System.out.println("implement Rock Music");
    }

    @Override
    public String getSong() {
        return "Rock Music";
    }
}
