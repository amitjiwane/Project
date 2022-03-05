package com.example.demo.services;

import java.util.List;

import com.example.demo.model.DiagnosticTest;

public interface DiagnosticTestService {

	DiagnosticTest addTest(DiagnosticTest diagnosticTest);
	
	List<DiagnosticTest> getAllTest();

	DiagnosticTest getTestById(Integer Id);

	DiagnosticTest updateTestDetails(DiagnosticTest test);

	String removeTestById(Integer id);
}
