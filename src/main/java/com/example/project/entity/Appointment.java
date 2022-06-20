package com.example.project.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@ToString
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

//    private LocalDateTime date;
    private LocalDateTime time;

    @Enumerated(EnumType.STRING)
    private AppointmentStatus status;

    @ManyToOne
    @JoinColumn(name = "doctor_id")
    private Doctor doctor;

    @ManyToOne
    @JoinColumn(name = "patient_id")
    private User patient;

    @ManyToOne
    @JoinColumn(name = "service_id")
    private Service service;

//    public Appointment(Long id, LocalDateTime date, AppointmentStatus status, Doctor doctor, User patient, Service service) {
//        this.id = id;
//        this.date = date;
//        this.status = status;
//        this.doctor = doctor;
//        this.patient = patient;
//        this.service = service;
//    }
    public Appointment(Long id, LocalDateTime time, AppointmentStatus status, Doctor doctor, User patient, Service service) {
        this.id = id;
        this.time = time;
        this.status = status;
        this.doctor = doctor;
        this.patient = patient;
        this.service = service;
    }

    public Appointment() {
    }

    public Long getId() {
        return id;

    }

    public void setId(Long id) {
        this.id = id;
    }

//    public LocalDateTime getDate() {
//        return date;
//    }
//
//    public void setDate(LocalDateTime date) {
//        this.date = date;
//    }


    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public AppointmentStatus getStatus() {
        return status;
    }

    public void setStatus(AppointmentStatus status) {
        this.status = status;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public User getPatient() {
        return patient;
    }

    public void setPatient(User patient) {
        this.patient = patient;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }
}
