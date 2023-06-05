package com.spring6dependencyinjection.springframework.controllers;

import com.spring6dependencyinjection.springframework.services.GreetingService;
import com.spring6dependencyinjection.springframework.services.GreetingServiceImpl;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    private final GreetingService greetingService;

    public MyController() {
        this.greetingService = new GreetingServiceImpl();
    }

    public String sayHello(){
        System.out.println("I'm in the controller");

        return greetingService.sayGreeting();
    }
}
