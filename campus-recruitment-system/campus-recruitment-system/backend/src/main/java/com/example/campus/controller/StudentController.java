package com.example.campus.controller;

import com.example.campus.entity.Student;
import com.example.campus.service.StudentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
@CrossOrigin(origins = "*")
public class StudentController {
    private final StudentService studentService;
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }
    @GetMapping
    public List<Student> list() {
        return studentService.findAll();
    }
    @PostMapping
    public ResponseEntity<Student> create(@RequestBody Student student) {
        return ResponseEntity.ok(studentService.save(student));
    }
    @PutMapping("/{id}")
    public ResponseEntity<Student> update(@PathVariable Long id, @RequestBody Student student) {
        student.setId(id);
        return ResponseEntity.ok(studentService.save(student));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        studentService.delete(id);
        return ResponseEntity.noContent().build();
    }
}