package com.java.practicedocker.home;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Getting {

    @RequestMapping("/hello")
    public String getting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return "Hello " + name + ", Welcome to here. This project is practice docker (dockerfile and docker compose)";
    }
}
