package com.easybytes.ex4.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Primary
@Component("espresso")
public class Espresso implements Coffee {
    public  String makeCoffee(){
        return ("Espresso Coffee is Ready");
    }

}
