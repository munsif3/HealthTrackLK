package me.munsif.healthtracklk.dao;

import me.munsif.healthtracklk.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {
    // add any custom query methods here, if needed
}
