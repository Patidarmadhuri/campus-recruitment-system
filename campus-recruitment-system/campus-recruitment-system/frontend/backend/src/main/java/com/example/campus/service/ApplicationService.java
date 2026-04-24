package com.example.campus.service;

import com.example.campus.entity.Application;
import com.example.campus.entity.Job;
import com.example.campus.entity.Student;
import com.example.campus.repository.ApplicationRepository;
import com.example.campus.repository.JobRepository;
import com.example.campus.repository.StudentRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ApplicationService {
    private final ApplicationRepository applicationRepository;
    private final StudentRepository studentRepository;
    private final JobRepository jobRepository;

    public ApplicationService(ApplicationRepository applicationRepository, StudentRepository studentRepository, JobRepository jobRepository) {
        this.applicationRepository = applicationRepository;
        this.studentRepository = studentRepository;
        this.jobRepository = jobRepository;
    }

    public List<Application> findAll() {
        return applicationRepository.findAll();
    }

    @Transactional
    public Application apply(Long studentId, Long jobId) {
        Student student = studentRepository.findById(studentId).orElseThrow();
        Job job = jobRepository.findById(jobId).orElseThrow();
        Application application = new Application(student, job, "APPLIED");
        return applicationRepository.save(application);
    }

    public Application save(Application application) {
        return applicationRepository.save(application);
    }
    public void delete(Long id) {
        applicationRepository.deleteById(id);
    }
}