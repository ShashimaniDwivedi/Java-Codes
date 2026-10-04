package com.easybytes.ex3;

import com.easybytes.ex3.beans.Car;
import com.easybytes.ex3.beans.Engine;
import com.easybytes.ex3.beans.Person;
import com.easybytes.ex3.beans.Vehicle;
import com.easybytes.ex3.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Example3 {
    static void main() {

        var context=new AnnotationConfigApplicationContext(ProjectConfig.class);

        var veh=context.getBean(Vehicle.class);
        var person=context.getBean(Person.class);
        System.out.println(veh.getName());
        System.out.println(person.getName());
        System.out.println(person.getVehicle());

        var car=context.getBean(Car.class);
        var engine=context.getBean(Engine.class);
        System.out.println(car.getName());
        System.out.println(engine.getName());
        System.out.println(car.getEngine());




    }
}
