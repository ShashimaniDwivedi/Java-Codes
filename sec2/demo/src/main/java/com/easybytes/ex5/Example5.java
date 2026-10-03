package com.easybytes.ex5;


import com.easybytes.ex5.beans.Bike;
import com.easybytes.ex5.beans.Engine;
import com.easybytes.ex5.beans.Vehicle;
import com.easybytes.ex5.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example5 {
    static void main() {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        if (context.containsBean("engine")) {
            Engine engine = context.getBean(Engine.class);
            System.out.println("Engine name = " + engine.getName());
        }
        if (context.containsBean("vehicle")) {
            Vehicle v = context.getBean(Vehicle.class);
            System.out.println("Vehicle name = " + v.getName());
            System.out.println("Vehicle engine = " + v.getEngine());
        }
        if (context.containsBean("bike")) {
            Bike b = context.getBean(Bike.class);
            System.out.println("Bike model = " + b.getName());
        }




    }
}
