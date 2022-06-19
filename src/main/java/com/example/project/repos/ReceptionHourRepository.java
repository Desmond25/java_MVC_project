package com.example.project.repos;

import com.example.project.entity.ReceptionHour;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReceptionHourRepository extends JpaRepository<ReceptionHour, Long> {
}