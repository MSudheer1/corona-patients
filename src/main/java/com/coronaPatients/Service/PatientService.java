package com.coronaPatients.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.coronaPatients.Entity.Patient;
import com.coronaPatients.Repo.PatientRepo;

@Service
public class PatientService {
      
	@Autowired
	PatientRepo repo;
	
	public void addPatient(Patient caseId) {
		repo.save(caseId);
	}
	
	public Iterable<Patient> retriveAllRecords()
	{
		Iterable<Patient> retriveAllRecords = repo.findAll();
		return retriveAllRecords;
	}
	
	public Optional<Patient> retriveSingleRecord(Integer caseId){
		return repo.findById(caseId);
	}
	
	public void updatePatient(Patient caseId) {
		repo.save(caseId);
	}
	
	public void deleteById(Integer caseId) {
		repo.deleteById(caseId);
	}
	
	public void deleteAll() {
		repo.deleteAll();
	}
	
}
