package com.dc.tasksend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class TaskSendApplication {

    public static void main(String[] args) {
        SpringApplication.run(TaskSendApplication.class, args);
    }

}
