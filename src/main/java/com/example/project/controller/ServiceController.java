package com.example.project.controller;

import com.example.project.entity.Service;
import com.example.project.entity.Speciality;
import com.example.project.repos.ServiceRepo;
import com.example.project.repos.SpecialityRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/adminPage/services")
public class ServiceController {
    @Autowired
    ServiceRepo serviceRepo;
    @Autowired
    SpecialityRepo specialityRepo;

    @GetMapping
    public String serviceList(Model model) {
        model.addAttribute("services", serviceRepo.findAll());
        return "serviceList";
    }

    @GetMapping("/add")
    public String serviceAdd(Model model) {
        model.addAttribute("specialities", specialityRepo.findAll());
        model.addAttribute("service", new Service());
        return "serviceAdd";
    }

    @PostMapping("/add")
    public String serviceSave(@ModelAttribute Service service) {
        service.setActive(true);
        serviceRepo.save(service);
        return "redirect:/adminPage/services";
    }

    @GetMapping("{service}")
    public String serviceEdit(@PathVariable Service service, Model model){
        model.addAttribute("specialities", specialityRepo.findAll());
        model.addAttribute("service", service);

        return "serviceEdit";
    }

    @PostMapping("{service}")
    public String editedServiceSave(@ModelAttribute Service service) {
        serviceRepo.save(service);
        return "redirect:/adminPage/services";
    }

    @GetMapping("{service}/ban")
    public String banService(@PathVariable Service service) {
        service.setActive(!service.isActive());
        serviceRepo.save(service);

        return "redirect:/adminPage/services";
    }
}
