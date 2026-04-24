package com.example.campus.entity;

import jakarta.persistence.*;

/**
 * Represents a student participating in campus recruitment.
 */
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String degree;

    public Student() {}

    public Student(String name, String email, String degree) {
        this.name = name;
        this.email = email;
        this.degree = degree;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getDegree() { return degree; }
    public void setDegree(String degree) { this.degree = degree; }
}