package org.example;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

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
}
