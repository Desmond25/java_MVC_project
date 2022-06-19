package com.example.project.repos;

import com.example.project.entity.Speciality;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpecialityRepo extends JpaRepository<Speciality, Long> {
}
