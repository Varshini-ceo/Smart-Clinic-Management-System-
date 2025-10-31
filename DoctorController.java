package com.clinic.controller;

import com.clinic.service.DoctorService;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/doctor")
public class DoctorController {

    private final DoctorService doctorService;
    public DoctorController(DoctorService doctorService) { this.doctorService = doctorService; }

    @GetMapping("/availability/{doctorId}/{date}")
    public ResponseEntity<?> getDoctorAvailability(
            @PathVariable Long doctorId,
            @PathVariable String date,
            @RequestHeader("Authorization") String token) {

        if (!token.startsWith("token-")) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid token");
        }

        List<String> available = doctorService.getDoctorAvailability(doctorId, date);
        return ResponseEntity.ok(available);
    }
}
