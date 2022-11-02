package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {

    @Autowired
    private StudentRepository  studentRepository;

    @PostMapping("/students")
    public  String insert(@RequestBody Student student){

        studentRepository.save(student);

        return "執行資料庫的 Create 操作";
    }

    @PutMapping("/students/{studentId}")
    public String update(@PathVariable Integer studentId,
                                @RequestBody Student student){

        Student s = studentRepository.findById(studentId).orElse(null);

        //        student.setId(studentId);
        //        studentRepository.save(student);
        if (s != null){
            s.setName(student.getName());
            studentRepository.save(s);

            return "執行資料庫的 Update 操作";
        }else{
            return "Update 失敗，數據不存在";
        }

    }

    @DeleteMapping("/students/{studentId}")
    public String delete(@PathVariable Integer studentId){

        studentRepository.deleteById(studentId);

        return "執行資料庫的 Delete 操作";
    }

    @GetMapping("/students/{studentId}")
    public Student read(@PathVariable Integer studentId){

        Student student = studentRepository.findById(studentId).orElse(null);

        return student;
    }
}
