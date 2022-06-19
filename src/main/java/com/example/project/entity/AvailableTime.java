package com.example.project.entity;

import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

@Entity
@ToString
public class AvailableTime {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "doctor_id")
    private Doctor doctor;

    @Temporal(TemporalType.TIME)
    private Date time;

    public AvailableTime(Long id, Doctor doctor, Date time) {
        this.id = id;
        this.doctor = doctor;
        this.time = time;
    }

    public AvailableTime() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}
