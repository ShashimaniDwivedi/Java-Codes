package com.easybytes.ex2.beans;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class Vehicle implements InitializingBean, DisposableBean {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void sayHello(){
        System.out.println("Hello Java");
    }
// interface method abstract
    @Override
    public void afterPropertiesSet() throws Exception {
    this.name="Verna 1.6";

    }

    @Override
    public void destroy() throws Exception {
             System.out.println("Destroying the Bean");
    }
    //Telling Spring please execute method when bean is created
    //2 way to initialize
//@PostConstruct
//    public void initialize(){
//    this.name="Verna";
//    }

//    @PreDestroy
//    public void Destroy(){
//        System.out.println("Destroying Bean");
//    }
}
