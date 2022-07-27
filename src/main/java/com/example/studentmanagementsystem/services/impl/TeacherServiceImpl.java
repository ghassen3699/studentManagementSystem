package com.example.studentmanagementsystem.services.impl;

import com.example.studentmanagementsystem.entitys.Teacher;
import com.example.studentmanagementsystem.repositories.TeacherRepository;
import com.example.studentmanagementsystem.services.TeacherService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService {
    private TeacherRepository teacherRepository ;

    public  TeacherServiceImpl(TeacherRepository teacherRepository){
        super();
        this.teacherRepository = teacherRepository ;
    }

    @Override
    public List<Teacher> getAllTeachers(){
        return teacherRepository.findAll() ;
    }

    @Override
    public Teacher saveTeacher( Teacher teacher){
        return teacherRepository.save(teacher) ;
    }
}
