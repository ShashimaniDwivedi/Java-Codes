package com.easybytes.ex1.config;

import com.easybytes.ex1.beans.Vehicle;
import org.springframework.context.annotation.*;

@Configuration
@Import({AnotherProjectConfig.class})
public class ProjectConfig {
    //giving name to name 3 way
    //Bean Aliasing giving multiple name to bean
//    @Bean(name="tesla")
    @Bean({"tesla","Electric"})
    //provide description to bean
    @Description("This is Electric car")
    Vehicle vehicle1(){
        var v=new Vehicle();
        v.setName("Tesla");
        return v;
    }
    //primary mafe default bean
@Primary
    @Bean(value="bmw")
Vehicle vehicle2(){
        var v=new Vehicle();
        v.setName("BMW");
        return v;
    }

    @Bean("mustang")
    Vehicle vehicle3(){
        var v=new Vehicle();
        v.setName("mustang");
        return v;
    }


    @Bean
    String hello(){
        return "Hello World";
    }
    @Bean
    Integer luckyNumber(){
        return 2;
    }
}
