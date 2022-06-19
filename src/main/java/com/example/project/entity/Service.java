package com.example.project.entity;

import lombok.ToString;

import javax.persistence.*;

@Entity
@ToString
public class Service {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "speciality_id")
    private Speciality speciality;

    private int price;
    private boolean isActive;

    public Service(Long id, String name, Speciality speciality, int price, boolean isActive) {
        this.id = id;
        this.name = name;
        this.speciality = speciality;
        this.price = price;
        this.isActive = isActive;
    }

    public Service() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Speciality getSpeciality() {
        return speciality;
    }

    public void setSpeciality(Speciality speciality) {
        this.speciality = speciality;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
