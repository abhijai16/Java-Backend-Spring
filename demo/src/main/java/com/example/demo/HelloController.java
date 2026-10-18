package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {
    
    @GetMapping("hello")  //we are mapping https://localhost:8080/hello with this
    public String hello(){
        return "<h1>Hello Controller</h1>";
    }
    
}
