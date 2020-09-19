package com.magic.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestHello {

    @RequestMapping("/hello")
    public String hello(){
        return "hello、你好";
    }
}
