package com.greeting.example.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/name")
public class GreetingServerController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @GetMapping
    public String getName() {
        logger.info("Entered getName() method");
        return "Surya";
    }

}
