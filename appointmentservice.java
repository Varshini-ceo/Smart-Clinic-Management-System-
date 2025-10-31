package com.clinic.service;

import java.time.LocalDate;
import java.util.List;
import org.springframework.stereotype.Service;
import com.clinic.entity.Appointment;
import com.clinic.repository.AppointmentRepository;

@Service
public class AppointmentService {

    private final AppointmentRepository appointmentRepository;
    public AppointmentService(AppointmentRepository repo) { this.appointmentRepository = repo; }

    public Appointment createAppointment(Appointment appointment) {
        return appointmentRepository.save(appointment);
    }

    public List<Appointment> getAppointmentsByDoctorAndDate(Long doctorId, LocalDate date) {
        return appointmentRepository.findByDoctorIdAndAppointmentDate(doctorId, date.atStartOfDay());
    }
}
