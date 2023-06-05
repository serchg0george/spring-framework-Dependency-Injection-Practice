package com.spring6dependencyinjection.springframework.services;

import org.springframework.stereotype.Service;

@Service("setterGreetingBean")
public class GreetingServiceSetterInjection implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hey i'm Setting a Greeting!!!";
    }
}
