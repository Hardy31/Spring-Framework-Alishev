package org.example;

public class ClassicalMusic implements Music {
    private ClassicalMusic() {
        System.out.println("конструктор ClassicalMusic");
    }
    // данный конструктор сделали приватным, чтобы его не льзя было создать с помошью new!!!!

    public static ClassicalMusic getClassicalMusic(){
        System.out.println("ClassicalMusic - фабричный метод");
        return new ClassicalMusic();
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


