package com.example.campus.controller;

import com.example.campus.entity.Application;
import com.example.campus.service.ApplicationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/applications")
@CrossOrigin(origins = "*")
public class ApplicationController {
    private final ApplicationService applicationService;
    public ApplicationController(ApplicationService applicationService) {
        this.applicationService = applicationService;
    }
    @GetMapping
    public List<Application> list() {
        return applicationService.findAll();
    }
    /**
     * Create an application for the given student and job IDs.
     */
    @PostMapping("/apply")
    public ResponseEntity<Application> apply(@RequestParam Long studentId, @RequestParam Long jobId) {
        return ResponseEntity.ok(applicationService.apply(studentId, jobId));
    }
    @PutMapping("/{id}")
    public ResponseEntity<Application> update(@PathVariable Long id, @RequestBody Application application) {
        application.setId(id);
        return ResponseEntity.ok(applicationService.save(application));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        applicationService.delete(id);
        return ResponseEntity.noContent().build();
    }
}