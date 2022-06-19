//package com.example.project.controller;
//
//import com.example.project.entity.Service;
//import com.example.project.repos.AvailableTimeRepo;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.*;
//
//@Controller
//public class AvailableTimeController {
//    private final AvailableTimeRepo availableTimeRepo;
//
//    public AvailableTimeController(AvailableTimeRepo availableTimeRepo) {
//        this.availableTimeRepo = availableTimeRepo;
//    }
//
//    @GetMapping("/adminPage/doctors/time")
//    public String timeList(Model model) {
//        model.addAttribute("time", availableTimeRepo.findAll());
//        return "timeList";
//    }
//
//    @GetMapping("/add")
//    public String timeAdd(Model model) {
//        model.addAttribute("time", specialityRepo.findAll());
//        model.addAttribute("service", new Service());
//        return "serviceAdd";
//    }
//
//    /*
//    @GetMapping("/add")
//    public String serviceAdd(Model model) {
//        model.addAttribute("specialities", specialityRepo.findAll());
//        model.addAttribute("service", new Service());
//        return "serviceAdd";
//    }
//
//    @PostMapping("/add")
//    public String serviceSave(@ModelAttribute Service service) {
//        service.setActive(true);
//        serviceRepo.save(service);
//        return "redirect:/adminPage/services";
//    }
//
//    @GetMapping("{service}")
//    public String serviceEdit(@PathVariable Service service, Model model){
//        model.addAttribute("specialities", specialityRepo.findAll());
//        model.addAttribute("service", service);
//
//        return "serviceEdit";
//    }
//
//    @PostMapping("{service}")
//    public String serviceSave(
//            @RequestParam String name,
//            @ModelAttribute Service service
//    ) {
//        service.setName(name);
//        serviceRepo.save(service);
//        return "redirect:/adminPage/services";
//    }
//
//    @GetMapping("{service}/ban")
//    public String banService(@PathVariable Service service) {
//        service.setActive(!service.isActive());
//        serviceRepo.save(service);
//
//        return "redirect:/adminPage/services";
//    }
//     */
//}
