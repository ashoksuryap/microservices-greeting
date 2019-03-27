package com.greeting.example.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greeting")
public class GreetingClientController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private GreetingClientFeign greetingClientFeign;

    @GetMapping
    public String helloRestFeign() {
        String name = greetingClientFeign.getName();
        logger.info("Response************ {}", name);
        return "Hello " + greetingClientFeign.getName();
    }
}
