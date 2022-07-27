package com.example.studentmanagementsystem.services;

import com.example.studentmanagementsystem.entitys.Teacher;

import java.util.List;

public interface TeacherService {
    List<Teacher> getAllTeachers() ;

    Teacher saveTeacher( Teacher teacher) ;
}
