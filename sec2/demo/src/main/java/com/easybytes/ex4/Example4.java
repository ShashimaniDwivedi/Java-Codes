package com.easybytes.ex4;


import com.easybytes.ex4.beans.Coffee;
import com.easybytes.ex4.beans.CoffeeShop;
import com.easybytes.ex4.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example4 {
    static void main() {

        var context=new AnnotationConfigApplicationContext(ProjectConfig.class);
        var coffeeShop=context.getBean(CoffeeShop.class);
        Coffee coffee=coffeeShop.getCoffee();
        System.out.println(coffee.makeCoffee());




    }
}
