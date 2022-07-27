package com.example.studentmanagementsystem.services;

import com.example.studentmanagementsystem.entitys.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents() ;

    Student saveStudent(Student student) ;
}
