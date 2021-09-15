package com.example.springbootapi.controller;


import com.example.springbootapi.entity.Student;
import com.example.springbootapi.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@ComponentScan(basePackages = "com.example")
public class MainController {
@Autowired
   private StudentService test;

    @GetMapping("/")
    public List<Student> getListStudent(){
    return test.findAll();
}

    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable("id") int id) {
        return test.getStudent(id);
    }
    @PostMapping
    public String addStudent(@RequestBody Student x) {
        test.addStudent(x);
        return "Add";
    }

    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable("id") int id) {
        test.deleteStudent(id);
        return "Delete";
    }

    @PutMapping("/{id}")
    public String updateStudent(@PathVariable("id") int id,@RequestBody Student x) {
        x.setId(id);
        test.updateStudent(x);
        return "Update";
    }

}
