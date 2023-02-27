package com.backend.siri.services;

import com.backend.siri.models.Appointment;
import com.backend.siri.models.Doctor;

public interface DoctorServ {
	
	public Doctor addDoctor(Doctor doctor);
	
	public Doctor viewDoctor(String doctorId);
	
	public Doctor deleteDoctor(String doctorId);
	
	public Doctor updateDoctor(String doctorId, Doctor doctor);
	
	public Appointment viewAppointments(String doctorId);
	
	public Appointment deleteAppointment(String appointmentId);
	
}
