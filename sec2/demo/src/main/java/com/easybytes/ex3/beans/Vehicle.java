package com.easybytes.ex3.beans;


public class Vehicle  {
    private String name;



    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void sayHello(){
        System.out.println("Hello Java");
    }


    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                '}';
    }

}
