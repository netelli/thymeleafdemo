package com.study.springboot.thymeleafdemo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class FunRestController {

    @GetMapping("/")
    public String sayHello() {
        return "Hello. Time in a server is " + LocalDateTime.now();
    }

    @GetMapping("/workout")
    public String getWorkout() {
        return "run a hard 5K!";
    }
}
