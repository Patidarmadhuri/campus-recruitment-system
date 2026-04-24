package com.example.campus.controller;

import com.example.campus.entity.Company;
import com.example.campus.service.CompanyService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/companies")
@CrossOrigin(origins = "*")
public class CompanyController {
    private final CompanyService companyService;
    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }
    @GetMapping
    public List<Company> list() {
        return companyService.findAll();
    }
    @PostMapping
    public ResponseEntity<Company> create(@RequestBody Company company) {
        return ResponseEntity.ok(companyService.save(company));
    }
    @PutMapping("/{id}")
    public ResponseEntity<Company> update(@PathVariable Long id, @RequestBody Company company) {
        company.setId(id);
        return ResponseEntity.ok(companyService.save(company));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        companyService.delete(id);
        return ResponseEntity.noContent().build();
    }
}