package com.example.studentmanagementsystem.controllers;

import com.example.studentmanagementsystem.entitys.Student;
import com.example.studentmanagementsystem.services.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentController {

    private StudentService studentService ;

    public StudentController(StudentService studentService) {
        super();
        this.studentService = studentService;
    }

    @GetMapping("/students")
    public String listStudents(Model model){
        model.addAttribute("Student",studentService.getAllStudents());
        return "students" ;
    }

    @GetMapping("/students/new")
    public String addStudent(Model model){
        Student student  = new Student() ;
        model.addAttribute("Student", student) ;
        return "create_student" ;
    }

    @PostMapping("/students")
    public String saveStudent(@ModelAttribute("Student") Student student){
        studentService.saveStudent(student) ;
        return "redirect:/students" ;
    }


}
