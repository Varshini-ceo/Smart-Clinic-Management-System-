
package com.clinic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.clinic.entity.Patient;
import java.util.Optional;

public interface PatientRepository extends JpaRepository<Patient, Long> {
    Optional<Patient> findByEmail(String email);
    Optional<Patient> findByPhone(String phone);
}
