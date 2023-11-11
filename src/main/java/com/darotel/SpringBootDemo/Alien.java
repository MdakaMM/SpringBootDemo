package com.darotel.SpringBootDemo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//we use Scope annotation = prototype when we want to call different objects with different outputs in our main
@Scope(value = "prototype")
public class Alien {

    private int aId;
    private String aName;
    private int aAge;

    public Alien(){
        super();
        System.out.println("Object created.");
    }

    //getter and setter


    public int getaId() {
        return aId;
    }

    public void setaId(int aId) {
        this.aId = aId;
    }

    public String getaName() {
        return aName;
    }

    public void setaName(String aName) {
        this.aName = aName;
    }

    public int getaAge() {
        return aAge;
    }

    public void setaAge(int aAge) {
        this.aAge = aAge;
    }

    //toString method


    @Override
    public String toString() {
        return "Alien{" +
                "aId=" + aId +
                ", aName='" + aName + '\'' +
                ", aAge=" + aAge +
                '}';
    }

    public void show(){
        System.out.println("Welcome to the course");
    }
}
