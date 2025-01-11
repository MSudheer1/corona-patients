package com.coronaPatients.Repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.coronaPatients.Entity.Patient;

@Repository
public interface PatientRepo extends CrudRepository<Patient, Integer>{

}
