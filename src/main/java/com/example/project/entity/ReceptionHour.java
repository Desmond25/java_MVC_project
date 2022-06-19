package com.example.project.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalTime;

@Entity
@Table(name = "Reception_hours")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ReceptionHour {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "time", unique = true)
    private LocalTime time;
}
