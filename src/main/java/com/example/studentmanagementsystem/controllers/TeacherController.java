package com.example.studentmanagementsystem.controllers;


import com.example.studentmanagementsystem.entitys.Teacher;
import com.example.studentmanagementsystem.services.TeacherService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TeacherController {
    private TeacherService teacherService ;

    public TeacherController(TeacherService teacherService){
        super();
        this.teacherService = teacherService ;
    }

    @GetMapping("/teachers")
    public String listTeachers(Model model){
        model.addAttribute("teacher", teacherService.getAllTeachers());
        return "teachers" ;
    }

    @GetMapping("/teachers/new")
    public String addTeacher(Model model){
        Teacher teacher = new Teacher() ;
        model.addAttribute("teacher", teacher) ;
        return "create_teacher" ;
    }

    @PostMapping("/teachers")
    public  String saveStudent(@ModelAttribute("teacher") Teacher teacher){
        teacherService.saveTeacher(teacher) ;
        return "redirect:/teachers" ;
    }

}
