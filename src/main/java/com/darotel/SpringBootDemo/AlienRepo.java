package com.darotel.SpringBootDemo;

import org.springframework.stereotype.Component;

@Component
public class AlienRepo {
    public void save(Alien a){
        System.out.println(a);
        System.out.println("Save to database");
    }

    public Alien get(int aid) {
        return new Alien();
    }
}
