package org.example;

public class ClassicalMusic implements Music {
    public ClassicalMusic() {
        System.out.println("implement ClassicalMusic");
    }

    @Override
    public String getSong() {
        return "Classical Music";
    }

    private void doMyInit(){
        System.out.println(" ClassicalMusic.doMyInit");
    }
    private void doMyDestroy(){
        System.out.println(" ClassicalMusic.doMyDestroy");
    }
}


