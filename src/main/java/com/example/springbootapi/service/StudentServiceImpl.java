package com.example.springbootapi.service;


import com.example.springbootapi.entity.Student;
import com.example.springbootapi.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{

@Autowired
private StudentRepository test;

    @Override
    public List<Student> findAll() {
        return test.findAll();
    }

    @Override
    public Student getStudent(int id) {
        return test.findById(id).get();
    }

    @Override
    public Boolean addStudent(Student x) {

        try {
    test.save(x);
        }
        catch (Exception e){

    return  false;
        }
        return true;
    }

    @Override
    public Boolean deleteStudent(int id) {
        try {
            test.deleteById(id);
        }
        catch (Exception e){

            return  false;
        }
        return true;
    }

    @Override
    public Boolean updateStudent(Student x) {
        try {
            test.save(x);
        }
        catch (Exception e){

            return  false;
        }
        return true;
    }


}
