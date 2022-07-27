package com.example.studentmanagementsystem.entitys;


import javax.persistence.*;

@Entity
@Table(name = "teacher")
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;

    @Column(name = "firstName", nullable = false)
    private String firstName ;

    @Column(name = "lastName")
    private String lastName ;

    @Column(name = "email")
    private String email ;

    @Column(name = "codeTeacher", nullable = false)
    private String codeTeacher ;

    public Teacher(){

    }

    public Teacher(Long id, String firstName, String lastName, String email, String codeTeacher){
        super();
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName ;
        this.email = email ;
        this.codeTeacher = codeTeacher ;
    }

    /* Getters and Setters */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getCodeTeacher() {
        return codeTeacher;
    }

    public void setCodeTeacher(String codeTeacher) {
        this.codeTeacher = codeTeacher;
    }
}
