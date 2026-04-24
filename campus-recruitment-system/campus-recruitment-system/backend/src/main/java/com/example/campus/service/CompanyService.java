package com.example.campus.service;

import com.example.campus.entity.Company;
import com.example.campus.repository.CompanyRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyService {
    private final CompanyRepository repository;
    public CompanyService(CompanyRepository repository) {
        this.repository = repository;
    }
    public List<Company> findAll() {
        return repository.findAll();
    }
    public Company save(Company company) {
        return repository.save(company);
    }
    public void delete(Long id) {
        repository.deleteById(id);
    }
}