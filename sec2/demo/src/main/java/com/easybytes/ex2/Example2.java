package com.easybytes.ex2;

import com.easybytes.ex2.beans.Vehicle;
import com.easybytes.ex2.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Example2 {
    static void main() {

        var context=new AnnotationConfigApplicationContext(ProjectConfig.class);

        var veh=context.getBean(Vehicle.class);
        System.out.println("Vehicle From Spring Context : "+veh.getName());
        veh.sayHello();
        context.close();


    }
}
