package com.example.happychat.api

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HealthCheckController {
    @GetMapping("/health_check")
    fun healthCheck() = ResponseEntity.ok("ok")
}