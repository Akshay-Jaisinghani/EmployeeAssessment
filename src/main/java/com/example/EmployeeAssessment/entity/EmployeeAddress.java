package com.example.EmployeeAssessment.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class EmployeeAddress {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String street;
    private String city;
    private String state;
    private String zipCode;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;

    // Getters and setters
}
