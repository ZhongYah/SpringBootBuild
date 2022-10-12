package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @RequestMapping("/test1")
    public String test1(@RequestParam Integer id,
                                @RequestParam(defaultValue = "Bob") String name) {
        System.out.println("id:" + id);
        System.out.println("name: " + name);
        return "Hello test1";
    }
}




