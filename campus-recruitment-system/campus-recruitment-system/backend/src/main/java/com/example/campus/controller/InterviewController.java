package com.example.campus.controller;

import com.example.campus.entity.Interview;
import com.example.campus.service.InterviewService;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/interviews")
@CrossOrigin(origins = "*")
public class InterviewController {
    private final InterviewService interviewService;
    public InterviewController(InterviewService interviewService) {
        this.interviewService = interviewService;
    }
    @GetMapping
    public List<Interview> list() {
        return interviewService.findAll();
    }
    /**
     * Schedule an interview for an application.
     *
     * Example request: POST /api/interviews/schedule?applicationId=1&scheduledAt=2025-01-01T10:00&location=Room1
     */
    @PostMapping("/schedule")
    public ResponseEntity<Interview> schedule(@RequestParam Long applicationId,
                                             @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime scheduledAt,
                                             @RequestParam String location) {
        return ResponseEntity.ok(interviewService.schedule(applicationId, scheduledAt, location));
    }
}