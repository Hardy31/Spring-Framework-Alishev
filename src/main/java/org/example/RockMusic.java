package org.example;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("rockMusic")
@Scope("prototype")
public class RockMusic implements Music{

    public RockMusic() {
        System.out.println("initialization Rock Music");
    }

    @Override
    public String getSong() {
        return "Rock Music";
    }

    @PostConstruct
    public void MyInitMethod(){
        System.out.println(" MyInitMethod - вызывается после  инициализации Rock Music");
    }
    @PreDestroy
    public void MyDestroyMethod(){
        System.out.println(" MyDestroyMethod - вызывается перед   удалением Rock Music");
    }
}
