
package com.clinic.controller;

import com.clinic.entity.Prescription;
import com.clinic.service.PrescriptionService;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/prescription")
public class PrescriptionController {

    private final PrescriptionService service;
    public PrescriptionController(PrescriptionService service) { this.service = service; }

    @PostMapping("/add/{token}")
    public ResponseEntity<?> addPrescription(
            @PathVariable String token, 
            @RequestBody Prescription prescription) {

        if (!token.startsWith("token-"))
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid token");

        return ResponseEntity.ok(service.savePrescription(prescription));
    }
}
