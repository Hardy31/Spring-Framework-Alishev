package org.example;

public class ClassicalMusic implements Music {
    public ClassicalMusic() {
        System.out.println("implement ClassicalMusic");
    }

    @Override
    public String getSong() {
        return "Classical Music";
    }
}

