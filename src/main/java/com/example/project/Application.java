package com.example.project;

import com.example.project.entity.WorkingTime;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        WorkingTime wk1 = new WorkingTime();
        wk1.setTime(LocalDateTime.of(LocalDate.of(1,1,1), LocalTime.of(1,1)));
        SpringApplication.run(Application.class, args);
    }

    // TODO: 19.06.2022 записи
    // TODO: 19.06.2022 время
    // TODO: 19.06.2022 функции
    // TODO: 19.06.2022 фронтенд
    // TODO: 19.06.2022 права
}
