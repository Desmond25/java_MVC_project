package com.example.project.repos;

import com.example.project.entity.AvailableTime;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AvailableTimeRepo extends JpaRepository<AvailableTime, Long> {
}
