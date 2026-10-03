package com.easybytes.ex4.beans;

import org.springframework.stereotype.Component;
//givng name to bean
@Component("capaciino")
public class Capaciino implements Coffee {
   public  String makeCoffee(){
        return ("Capacinno Coffee is Ready");
    }
}
