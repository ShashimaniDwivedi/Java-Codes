package com.easybytes.ex3.beans;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
    //    public Car() {
//        System.out.println("Car bean Created");
//    }
//Constructor injection
//    @Autowired
    //if a class has single constructor then mentioning autowired is optionall
    public Car(Engine e) {
        this.engine=e;
        System.out.println("Car bean Created");
    }

    private String name;

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    //Field Injection
//    @Autowired
    private Engine engine;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Car{" + "name='" + name + '\'' + '}';
    }

    @PostConstruct
    public void initialize() {
        this.name = "MG";
    }
}
