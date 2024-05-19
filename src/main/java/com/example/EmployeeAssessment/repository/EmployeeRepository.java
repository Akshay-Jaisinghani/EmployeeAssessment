package com.example.EmployeeAssessment.repository;

import com.example.EmployeeAssessment.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
