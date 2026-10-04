package com.easybytes.ex5.config;

import com.easybytes.ex5.beans.Bike;
import com.easybytes.ex5.beans.Engine;
import com.easybytes.ex5.beans.Vehicle;
import org.springframework.beans.factory.BeanRegistrar;
import org.springframework.beans.factory.BeanRegistry;
import org.springframework.core.env.Environment;

import java.util.Random;

public class MyBeanRegistrar implements BeanRegistrar {

    @Override
    public void register(BeanRegistry registry, Environment env) {
        int num=new Random().nextInt(100);
        System.out.println("Generated number : "+num);
        if(num%2==0){
            System.out.println("Even Registring Engine + vehicle");
            registry.registerBean("engine",Engine.class,spec->spec.supplier(
                    context->{
                        Engine e=new Engine();
                        e.setName("Sports Engine");
                        return e;
                    }
            ));
            registry.registerBean("vehicle",Vehicle.class,spec->spec.supplier(
                    context->{
                        Vehicle v=new Vehicle(context.bean(Engine.class));
                        v.setName("Sports Car");
                        return v;
                    }
            ));
        }
        else{
            System.out.println("Odd Registring Bike");
            registry.registerBean("bike",Bike.class,spec->spec.supplier(
                    context->{
                        Bike b=new Bike();
                        b.setName("Sports Bike");
                        return b;
                    }
            ));
        }
    }
}
