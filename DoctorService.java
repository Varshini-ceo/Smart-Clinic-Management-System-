package com.clinic.service;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DoctorService {

    public boolean validateLogin(String email, String password) {
        return email.equals("doctor@gmail.com") && password.equals("password123");
    }

    public List<String> getDoctorAvailability(Long doctorId, String date) {
        return List.of("09:00-11:00", "15:00-17:00");
    }
}
