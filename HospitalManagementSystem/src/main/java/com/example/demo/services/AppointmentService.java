package com.example.demo.services;



import java.util.List;

import com.example.demo.model.Appointment;

public interface AppointmentService {

Appointment addAppointment(Appointment appointment);
	
	List<Appointment> viewAppointments();
	
	Appointment viewAppointment(Integer id);
	
	Appointment updateAppointment(Appointment appointment);
	
//	List<Appointment> getAppointmentList(Integer centerId, String test, Integer Status);
	
	String removeAppointmentById(Integer id);
}
