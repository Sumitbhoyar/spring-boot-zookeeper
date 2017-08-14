package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@RequestMapping(path = "/version")
public class ServiceController {

    @GetMapping
    public String getVersion(){
        return "1.0.0.0"+new Random().nextInt(1000);
    }
}
