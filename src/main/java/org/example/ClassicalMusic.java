package org.example;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

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

    @PostConstruct
    public void MyInitMethod(){
        System.out.println(" MyInitMethod - вызывается после  инициализации Classical Music");
    }
    @PreDestroy
    public void MyDestroyMethod(){
        System.out.println(" MyDestroyMethod - вызывается перед   удалением Classical Music");
    }
}


