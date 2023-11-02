package com.eastshine.messenger.health;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class HealthController {

    @GetMapping("/health")
    public String health() {
        return String.valueOf(LocalDateTime.now());
    }
}
