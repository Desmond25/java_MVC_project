package com.example.project.entity;

import lombok.*;
import org.springframework.boot.autoconfigure.security.reactive.ReactiveSecurityAutoConfiguration;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private boolean isActive;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "doctor_speciality",
            joinColumns = @JoinColumn(name = "doctor_id"),
            inverseJoinColumns = @JoinColumn(name = "speciality_id")
    )
    private Set<Speciality> specialities;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "doctor_reception_hour",
            joinColumns = @JoinColumn(name = "doctor_id"),
            inverseJoinColumns = @JoinColumn(name = "reception_hour_id")
    )
    @ToString.Exclude
    private List<ReceptionHour> receptionHours;

    @OneToMany(mappedBy = "doctor")
    @ToString.Exclude
    List<Appointment> appointments;

    public Doctor(Long id, User user, Set<Speciality> specialities, boolean isActive) {
        this.id = id;
        this.user = user;
        this.specialities = specialities;
        this.isActive = isActive;
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
