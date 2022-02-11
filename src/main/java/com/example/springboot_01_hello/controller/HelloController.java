package com.example.springboot_01_hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @RequestMapping("Hello")
    @ResponseBody
    public String hello(){
        return "hello";
    }
}
