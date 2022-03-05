package com.example.demo.model;


import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Entity
@Data
public class Appointment{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer appointmentId;
	//this name is for checking purpose whether data is added or not
	private String name;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-mm-dd")
	private Date appointmentDate;
	private String description;

	@OneToOne(cascade = CascadeType.ALL)
	private Patient patient;

	@OneToOne(cascade = CascadeType.ALL)
	private DiagnosticCenter diagnosticCenter;

	@OneToMany(cascade = CascadeType.ALL)
	private List<DiagnosticTest> diagnoticTest;

//	@OneToOne(cascade = CascadeType.ALL)
//	private DiagnosticTest diagnosticTest;

	@OneToMany(cascade = CascadeType.ALL)
	private List<TestResult> testResult;

//	@OneToOne
//	private TestResult testResult;
	
//	private ApprovalStatus approvalStatus;
		

	
	
}
