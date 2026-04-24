package com.example.campus.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

/**
 * Represents a job posting by a company.
 */
@Entity
public class Job {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private LocalDate postedDate;

    @ManyToOne
    @JoinColumn(name = "company_id")
    private Company company;

    public Job() {
        this.postedDate = LocalDate.now();
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public LocalDate getPostedDate() { return postedDate; }
    public void setPostedDate(LocalDate postedDate) { this.postedDate = postedDate; }
    public Company getCompany() { return company; }
    public void setCompany(Company company) { this.company = company; }
}