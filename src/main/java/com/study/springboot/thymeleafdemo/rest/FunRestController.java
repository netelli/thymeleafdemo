package com.study.springboot.thymeleafdemo.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class FunRestController {

    @Value("${coach.name}")
    private String name;

    @Value("${coach.team}")
    private String team;

    @GetMapping("/")
    public String sayHello() {
        return "Hello. Time in a server is " + LocalDateTime.now();
    }

    @GetMapping("/workout")
    public String getWorkout() {
        return "run a hard 5K!";
    }

    @GetMapping("/teamInfo")
    public String getTeamInfo() {
        return "Name is " + name + ", team is '" + team + "'";
    }
}
