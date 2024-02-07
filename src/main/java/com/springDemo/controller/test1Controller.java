package com.springDemo.controller;

import com.springDemo.entity.ResultData;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class test1Controller {
    @GetMapping("/test1")
    public ResultData test1(){
        ResultData rd = new ResultData("200", "成功");
        return rd;
    }
}
