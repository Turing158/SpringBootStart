package com.springDemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//testController.java
@Controller
public class testController {
    @RequestMapping("/")
    public String test1(){
        return "test";
    }
}
