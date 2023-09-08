package com.example.lab4_20193733.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Entity
@Table(name = "job_history")
@Getter
@Setter
public class Historial {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "job_history_id", nullable = false)
    private int job_history_id;

    @Column (name = "employee_id", nullable = false)
    private int employee_id;

    @Column (name = "start_date", nullable = false)
    private Timestamp start_date;

    @Column (name = "end_date", nullable = false)
    private Timestamp end_date;

    @Column (name = "job_id", nullable = false)
    private String job_id;

    @Column (name = "department_id")
    private int department_id;

}
