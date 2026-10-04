package com.easybytes.ex1;

import com.easybytes.ex1.beans.Vehicle;
import com.easybytes.ex1.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Example1 {
    static void main() {

        var context=new AnnotationConfigApplicationContext(ProjectConfig.class);
//        var context=new AnnotationConfigApplicationContext(ProjectConfig.class, AnotherProjectConfig.class);
//        var veh=context.getBean(Vehicle.class);
        //To Remove Ambiguity
//        var veh=context.getBean("vehicle1",Vehicle.class);
        var veh=context.getBean("mustang", Vehicle.class);
        System.out.println("Vehicle name from  Spring Context : "+veh.getName());
        var veh1=context.getBean(Vehicle.class);
        System.out.println("Vehicle name from  Spring Context : "+veh1.getName());
        String h=context.getBean(String.class);
        System.out.println("String name from  Spring Context : "+h);

    }
}
