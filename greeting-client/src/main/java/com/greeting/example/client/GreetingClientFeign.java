package com.greeting.example.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by Ashok
 */
@Configuration
@FeignClient("GREETING-SERVER")
public interface GreetingClientFeign {
    @GetMapping("name")
    String getName();
}
