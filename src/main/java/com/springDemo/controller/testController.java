package com.springDemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
//testController.java
@Controller
public class testController {
    @RequestMapping("/")
    public String test1(){
        return "test";
    }

    @GetMapping("/testGet")
    public String test2(){
        System.out.println("使用了get请求访问");
        return "test";
    }
    @PostMapping("/testPost")
    public String test3(){
        System.out.println("使用了post请求访问");
        return "test";
    }

}
