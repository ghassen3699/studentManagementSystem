package com.example.studentmanagementsystem.services.impl;

import com.example.studentmanagementsystem.entitys.Student;
import com.example.studentmanagementsystem.repositories.StudentRepository;
import com.example.studentmanagementsystem.services.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private StudentRepository studentRepository ;

    public StudentServiceImpl(StudentRepository studentRepository) {
        super();
        this.studentRepository = studentRepository;
    }


    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }


    @Override
    public Student saveStudent( Student student){
        return studentRepository.save(student) ;
    }
}
