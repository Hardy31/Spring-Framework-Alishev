package org.example;

public class FirstBean {
    private String name;

    public FirstBean(String name) {
        this.name = name;
        System.out.println("Конструктор FirstBean");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
