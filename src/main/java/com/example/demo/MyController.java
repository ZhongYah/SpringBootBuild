package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MyController {

    @RequestMapping("/product")
    public Store product() {
        Store store = new Store();
        List<String> List = new ArrayList<>();
        List.add("蘋果");
        List.add("橘子");
        store.setProductList(List);
        return store;
    }

    @RequestMapping("/user")
    public Student user() {
        Student student = new Student();
        student.setName("Jay");
        student.setId(123);
        return student;
    }

}

