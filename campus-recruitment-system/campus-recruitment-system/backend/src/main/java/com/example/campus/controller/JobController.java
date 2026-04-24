package com.example.campus.controller;

import com.example.campus.entity.Job;
import com.example.campus.service.JobService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/jobs")
@CrossOrigin(origins = "*")
public class JobController {
    private final JobService jobService;
    public JobController(JobService jobService) {
        this.jobService = jobService;
    }
    @GetMapping
    public List<Job> list() {
        return jobService.findAll();
    }
    @PostMapping
    public ResponseEntity<Job> create(@RequestBody Job job) {
        return ResponseEntity.ok(jobService.save(job));
    }
    @PutMapping("/{id}")
    public ResponseEntity<Job> update(@PathVariable Long id, @RequestBody Job job) {
        job.setId(id);
        return ResponseEntity.ok(jobService.save(job));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        jobService.delete(id);
        return ResponseEntity.noContent().build();
    }
}