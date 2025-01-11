package com.coronaPatients.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Patient {
	   
	   @Id
	   @Column
       Integer caseId;
	   
	   @Column
       String name;
	   
	   @Column
       String gender;
	   
	   @Column
       String patientStatus;
       
	public Patient() {
		
	}

	public Patient(Integer caseId, String name, String gender, String patientStatus) {
		this.caseId = caseId;
		this.name = name;
		this.gender = gender;
		this.patientStatus = patientStatus;
	}

	public Integer getCaseId() {
		return caseId;
	}

	public void setCaseId(Integer caseId) {
		this.caseId = caseId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPatientStatus() {
		return patientStatus;
	}

	public void setPatientStatus(String patientStatus) {
		this.patientStatus = patientStatus;
	}    
}
