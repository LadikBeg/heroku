package com.example.heroku.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/heroku")
public class HerokuController {
    @GetMapping("/say")
    String doHeroku(){
    return "Hello";
    }
}
