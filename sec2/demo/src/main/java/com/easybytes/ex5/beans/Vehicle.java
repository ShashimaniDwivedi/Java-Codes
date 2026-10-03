package com.easybytes.ex5.beans;

public class Vehicle {
    private String name;
    private Engine engine;

    public Vehicle(Engine e){
        this.engine=e;
        System.out.println("Vehicle Bean Created");
    }
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "engine='" + engine + '\'' +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
