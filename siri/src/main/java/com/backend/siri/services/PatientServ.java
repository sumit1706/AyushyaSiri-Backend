package com.backend.siri.services;

import com.backend.siri.models.Appointment;
import com.backend.siri.models.Patient;

public interface PatientServ {
	
	public Patient addPatient(Patient patient);
	
	public Patient viewPatient(String patientId);
	
	public Patient deletePatient(String patientId);
	
	public Patient updatePatient(String patientId, Patient patient);
	
	public Appointment bookAppointment(String patientId, Appointment appointment);
	
	public Appointment viewAppointments(String patientId);
	
	public Appointment deleteAppointment(String appointmentId);	
	
}
