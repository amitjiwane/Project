package com.example.demo.services;

import java.util.List;

import com.example.demo.model.Appointment;
import com.example.demo.model.DiagnosticCenter;

public interface DiagnosticCenterService {

List<DiagnosticCenter> getAllDiagnosticCenters();
	
DiagnosticCenter getDiagnosticCenterById(Integer diagnosticCenterId);

	DiagnosticCenter addDiagnosticCenter(DiagnosticCenter diagnosticCenter);
	
	
	DiagnosticCenter updateDiagnosticCenter(DiagnosticCenter diagnosticCenter);
	
//	DiagnosticTest viewTestDetails(Integer diagnosticCenterId, String testName);
//	
//	DiagnosticTest addTest(Integer diagnosticCenterId, Integer testId);
	
	String removeDiagnosticCenter(Integer id);
	
//	List<Appointment> getListOfAppointments(String centerName);
}
