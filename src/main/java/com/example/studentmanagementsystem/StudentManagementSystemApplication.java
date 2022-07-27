package com.example.studentmanagementsystem;

import com.example.studentmanagementsystem.entitys.Student;
import com.example.studentmanagementsystem.repositories.StudentRepository;
import com.example.studentmanagementsystem.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(StudentManagementSystemApplication.class, args);
    }

    @Autowired
    private StudentRepository studentRepository ;

    @Override
    public void run(String... args) throws Exception{
        /*
        * Student student1 = new Student("student1","student1","student1@gmail.com");
        * studentRepository.save(student1) ;
        * Student student2 = new Student("student2","student2","student2@gmail.com");
        * studentRepository.save(student2) ;
        */
    }
}
