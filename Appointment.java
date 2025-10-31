package com.clinic.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Entity
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne private Doctor doctor;
    @ManyToOne private Patient patient;

    @NotNull
    @Future
    private LocalDateTime appointmentDate;

    private String status;

    // Getters and Setters
}
