package com.example.dockerizedspringboot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/talk")
    public String talkWithGuard(){
        return "I used to be adventurer like you, then I took an arrow in the knee.";
    }
}
