package com.easybytes.ex4.beans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CoffeeShop {

    private final Coffee coffee;


    public Coffee getCoffee() {
        return coffee;
    }

    public CoffeeShop(@Qualifier("espresso") Coffee coffee) {
        this.coffee = coffee;
    }
}
