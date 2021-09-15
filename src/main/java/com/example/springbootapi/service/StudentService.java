package com.example.springbootapi.service;

import com.example.springbootapi.entity.Student;

import java.util.List;

public interface StudentService {

    public List<Student> findAll();
    public Student getStudent(int id);
    public Boolean addStudent(Student x);
    public Boolean deleteStudent(int id);
    public Boolean updateStudent(Student x);

}
