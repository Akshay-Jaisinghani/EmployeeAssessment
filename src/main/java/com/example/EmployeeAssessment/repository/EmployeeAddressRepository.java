package com.example.EmployeeAssessment.repository;

import com.example.EmployeeAssessment.entity.EmployeeAddress;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeAddressRepository extends JpaRepository<EmployeeAddress, Long> {
}
