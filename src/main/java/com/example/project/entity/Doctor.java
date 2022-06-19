package com.example.project.entity;

import lombok.ToString;

import javax.persistence.*;
import java.util.Set;

@Entity
@ToString
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "speciality_id")
    private Set<Speciality> specialities;

    private boolean isActive;

    public Doctor(Long id, User user, Set<Speciality> specialities, boolean isActive) {
        this.id = id;
        this.user = user;
        this.specialities = specialities;
        this.isActive = isActive;
    }

    public Doctor() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Set<Speciality> getSpecialities() {
        return specialities;
    }

    public void setSpecialities(Set<Speciality> specialities) {
        this.specialities = specialities;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
