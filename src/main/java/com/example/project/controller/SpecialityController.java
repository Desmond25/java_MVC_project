package com.example.project.controller;

import com.example.project.entity.Speciality;
import com.example.project.repos.SpecialityRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/adminPage/specialities")
public class SpecialityController {
    @Autowired
    SpecialityRepo specialityRepo;

    @GetMapping
    public String specialityList(Model model) {
        model.addAttribute("specialities", specialityRepo.findAll());
        return "admin/specialityList";
    }

    @GetMapping("/add")
    public String specialityAdd(Model model) {
        model.addAttribute("speciality", new Speciality());
        return "admin/specialityAdd";
    }

    @PostMapping("/add")
    public String specialitySave(@ModelAttribute Speciality speciality) {
        speciality.setActive(true);
        specialityRepo.save(speciality);
        return "redirect:/adminPage/specialities";
    }

    @GetMapping("{speciality}")
    public String specialityEdit(@PathVariable Speciality speciality, Model model){
        model.addAttribute("speciality", speciality);

        return "admin/specialityEdit";
    }

    @PostMapping("{speciality}")
    public String specialitySave(
            @RequestParam String name,
            @ModelAttribute Speciality speciality
    ) {
        speciality.setName(name);
        specialityRepo.save(speciality);
        return "redirect:/adminPage/specialities";
    }

    @GetMapping("{speciality}/ban")
    public String banSpeciality(@PathVariable Speciality speciality) {
        speciality.setActive(!speciality.isActive());
        specialityRepo.save(speciality);

        return "redirect:/adminPage/specialities";
    }
}
