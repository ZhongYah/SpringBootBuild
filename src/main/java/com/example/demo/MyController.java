package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/detail")
@RestController
public class MyController {

    @RequestMapping("/product")
    public String product(){
        return "第一個是蘋果、第二個是橘子";
    }

    @RequestMapping("user")
    public String user(){
        return "名字為Jay";
    }
}
