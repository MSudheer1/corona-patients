package com.coronaPatients.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.coronaPatients.Entity.Patient;
import com.coronaPatients.Service.PatientService;

@RestController
public class PatientController {
     
	@Autowired
	PatientService service;
	
	@PostMapping(value="/add")
	public String addPatient(@RequestBody Patient caseId) 
	{
		service.addPatient(caseId);
		return "Patient Added -->";
	}
	
	@GetMapping(value="/retriveAllRecords")
	public Iterable<Patient> retriveAllRecord()
	{
		return service.retriveAllRecords();
	}
	
	@GetMapping(value="/retriveSingleRecord")
	public Optional<Patient> retriveSingleRecord(Integer caseId)
	{
		return service.retriveSingleRecord(caseId);
	}
	
	@PutMapping(value="/update")
	public String updatePatient(@RequestBody Patient caseId) {
		service.updatePatient(caseId);
		return "Data updated";
	}
	
	@DeleteMapping(value="/deleteById")
	public String deleteById(@RequestParam("caseId") Integer caseId) {
		service.deleteById(caseId);
		return "Data got Deleted -->";
	}
	
	@DeleteMapping(value="/deleteAll")
	public String deleteAll() {
		service.deleteAll();
		return "Data deleted";
		
	}

}
