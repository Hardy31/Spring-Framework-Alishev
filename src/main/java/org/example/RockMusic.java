package org.example;

public class RockMusic implements Music{
    public RockMusic() {
        System.out.println("implement Rock Music");
    }

    @Override
    public String getSong() {
        return "Rock Music";
    }
}
