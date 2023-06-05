package com.spring6dependencyinjection.springframework.services.i18n;

import com.spring6dependencyinjection.springframework.services.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("ES")
@Service("i18NService")
public class SpanishGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hola mundo - ES";
    }
}
