//package com.example.project.entity;
//
//import lombok.*;
//
//import javax.persistence.*;
//import java.time.LocalTime;
//
//@Entity
//@Table(name = "Reception_hours")
//public class ReceptionHour {
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private Long id;
//
//    @Column(name = "time", unique = true)
//    private LocalTime time;
//
//    public ReceptionHour(Long id, LocalTime time) {
//        this.id = id;
//        this.time = time;
//    }
//
//    public ReceptionHour(LocalTime time) {
//        this.time = time;
//    }
//
//    public ReceptionHour() {
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public LocalTime getTime() {
//        return time;
//    }
//
//    public void setTime(LocalTime time) {
//        this.time = time;
//    }
//}
