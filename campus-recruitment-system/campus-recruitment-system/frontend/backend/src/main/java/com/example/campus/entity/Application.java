package com.example.campus.entity;

import jakarta.persistence.*;

/**
 * Represents a student's application for a job.
 */
@Entity
public class Application {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    @ManyToOne
    @JoinColumn(name = "job_id")
    private Job job;

    // Application status: APPLIED, SHORTLISTED, REJECTED, etc.
    private String status;

    public Application() {}

    public Application(Student student, Job job, String status) {
        this.student = student;
        this.job = job;
        this.status = status;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public Student getStudent() { return student; }
    public void setStudent(Student student) { this.student = student; }
    public Job getJob() { return job; }
    public void setJob(Job job) { this.job = job; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}