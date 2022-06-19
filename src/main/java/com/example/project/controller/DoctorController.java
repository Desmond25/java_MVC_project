package com.example.project.controller;

import com.example.project.entity.*;
import com.example.project.repos.DoctorRepo;
import com.example.project.repos.SpecialityRepo;
import com.example.project.repos.UserRepo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/adminPage/doctors")
public class DoctorController {
    private final DoctorRepo doctorRepo;
    private final UserRepo userRepo;
    private final SpecialityRepo specialityRepo;

    public DoctorController(DoctorRepo doctorRepo, UserRepo userRepo, SpecialityRepo specialityRepo) {
        this.doctorRepo = doctorRepo;
        this.userRepo = userRepo;
        this.specialityRepo = specialityRepo;
    }

    @GetMapping
    public String doctorList(Model model) {
//        doctorRepo.deleteAll();
//        System.out.println(doctorRepo.findAll());
        model.addAttribute("doctors", doctorRepo.findAll());
        return "doctorList";
    }

    @GetMapping("/add")
    public String doctorAdd(Model model) {
        model.addAttribute("doctor", new Doctor());
        model.addAttribute("users", userRepo.findAll());
        model.addAttribute("specialities", specialityRepo.findAll());
        return "doctorAdd";
    }

    @PostMapping("/add")
    public String doctorSave(@ModelAttribute Doctor doctor) {
        doctor.setActive(true);

        doctorRepo.save(doctor);
        return "redirect:/adminPage/doctors";
    }

    @GetMapping("{doctor}")
    public String doctorEdit(@PathVariable Doctor doctor, Model model){
        model.addAttribute("users", userRepo.findAll());
        model.addAttribute("specialities", specialityRepo.findAll());
        model.addAttribute("doctor", doctor);

        return "doctorEdit";
    }

    @PostMapping("{doctor}")
    public String editedDoctorSave(@ModelAttribute Doctor doctor) {
        doctorRepo.save(doctor);

        return "redirect:/adminPage/doctors";
    }

    @GetMapping("{doctor}/ban")
    public String banDoctor(@PathVariable Doctor doctor) {
        doctor.setActive(!doctor.isActive());
        doctorRepo.save(doctor);

        return "redirect:/adminPage/doctors";
    }
}
