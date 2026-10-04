package com.eazybites.backend.Controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class DemoController {
    @GetMapping("/home")
//    @RequestMapping(path="/home",method={RequestMethod.GET,RequestMethod.POST})
    public String sayHello() {
        return "Hello Spring Boot";
    }


}
