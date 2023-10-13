package com.entegration.openai.controller;

import com.entegration.openai.service.WelcomeService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/welcome")
public class WelcomeController {
    private final WelcomeService welcomeService;


    public WelcomeController(WelcomeService welcomeService) {
        this.welcomeService = welcomeService;
    }//dependency injection

    @PostMapping("/sayhi")
    public String grathings(@RequestBody String name){
        return welcomeService.sayHi(name);
    }

    @GetMapping("/{name}")
    public String sayHi(@PathVariable(name="name") String name){
        return welcomeService.sayHi(name);
    }
}