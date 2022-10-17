package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Min;

@RestController
@Validated
public class StudentController {

    private Integer studentId;

    @PostMapping("/students")
    public String create(@RequestBody @Valid Student student){    //@Valid 務必要加，否則@NotNull、@NotBlank...等 會失效
//        if(student.getId() == null){
//            throw new RuntimeException("id 不可為 null");
//        }
        return "執行資料庫的 Create 操作";
    }

    @GetMapping("/students/{studentId}")
    public String read(@PathVariable @Min(100) Integer studentId){
        return "執行資料庫的 Read 操作";
    }

    @PutMapping("/students/studentId}")
    public String update(@PathVariable Integer studentId,
                                 @RequestBody Student student,
                                 @RequestHeader String info){
        return "執行資料庫的 Update 操作";
    }

    @DeleteMapping("/student/{studentId}")
    public String delete(@PathVariable Integer studentId){
        return "執行資料庫的 Delete 操作";
    }
}
