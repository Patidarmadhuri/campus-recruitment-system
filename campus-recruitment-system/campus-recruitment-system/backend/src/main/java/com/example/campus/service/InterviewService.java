package com.example.campus.service;

import com.example.campus.entity.Application;
import com.example.campus.entity.Interview;
import com.example.campus.repository.ApplicationRepository;
import com.example.campus.repository.InterviewRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class InterviewService {
    private final InterviewRepository interviewRepository;
    private final ApplicationRepository applicationRepository;

    public InterviewService(InterviewRepository interviewRepository, ApplicationRepository applicationRepository) {
        this.interviewRepository = interviewRepository;
        this.applicationRepository = applicationRepository;
    }

    public List<Interview> findAll() {
        return interviewRepository.findAll();
    }

    @Transactional
    public Interview schedule(Long applicationId, LocalDateTime scheduledAt, String location) {
        Application app = applicationRepository.findById(applicationId).orElseThrow();
        Interview interview = new Interview(app, scheduledAt, location);
        // update application status
        app.setStatus("INTERVIEW_SCHEDULED");
        applicationRepository.save(app);
        return interviewRepository.save(interview);
    }
}