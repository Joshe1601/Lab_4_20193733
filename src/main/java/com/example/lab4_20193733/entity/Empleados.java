package com.example.lab4_20193733.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;

@Entity
@Table(name = "employees")
@Getter
@Setter
public class Empleados {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_id", nullable = false)
    private int employee_id;


    @Column (name = "first_name")
    private String first_name;

    @Column (name = "last_name", nullable = false)
    private String last_name;

    @Column (name = "email", nullable = false)
    private String email;

    @Column (name = "phone_number")
    private String phone_number;

    @Column (name = "hire_date", nullable = false)
    private Timestamp hire_date;

    @Column (name = "job_id", nullable = false)
    private String job_id;

    @Column (name = "salary")
    private double salary;

    @Column (name = "commission_pct")
    private double commission_pct;

    @Column (name = "manager_id")
    private int manager_id;

    @Column (name = "department_id")
    private int department_id;


}
