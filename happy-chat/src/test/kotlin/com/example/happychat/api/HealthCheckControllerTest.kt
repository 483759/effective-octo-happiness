package com.example.happychat.api

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.springframework.http.ResponseEntity

internal class HealthCheckControllerTest {

    private lateinit var healthCheckController: HealthCheckController

    @BeforeEach
    fun setUp() {
        healthCheckController = HealthCheckController()
    }

    @Test
    fun healthCheck() {
        assertEquals(ResponseEntity.ok("ok"), healthCheckController.healthCheck())
    }
}