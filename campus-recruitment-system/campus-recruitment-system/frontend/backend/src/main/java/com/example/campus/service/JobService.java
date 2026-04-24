package com.example.campus.service;

import com.example.campus.entity.Job;
import com.example.campus.repository.JobRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {
    private final JobRepository repository;
    public JobService(JobRepository repository) {
        this.repository = repository;
    }
    public List<Job> findAll() {
        return repository.findAll();
    }
    public Job save(Job job) {
        return repository.save(job);
    }
    public void delete(Long id) {
        repository.deleteById(id);
    }
}