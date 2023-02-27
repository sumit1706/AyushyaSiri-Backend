package com.backend.siri.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.backend.siri.models.Appointment;
import com.backend.siri.models.Patient;
import com.backend.siri.services.PatientServ;

@RestController
public class PatientController {

	@Autowired
	private PatientServ patientServ;
	
	@GetMapping("/viewPatient/{patientId}")
	public Patient viewDoctor(@PathVariable String patientId) {
		return patientServ.viewPatient(patientId);
	}
	
	@PostMapping("/addPatient")
	public Patient addPatient(@RequestBody Patient patient) {
		return patientServ.addPatient(patient);
	}
	
	@PutMapping("/updatePatient/{patientId}")
	public Patient updatePatient(@PathVariable String patientId , @RequestBody Patient patient) {
		return patientServ.updatePatient(patientId, patient);
	}
	
	@DeleteMapping("/deletePatient/{patientId}")
	public Patient deletePatient(@PathVariable String patientId) {
		return patientServ.deletePatient(patientId);
	}
	
	@PostMapping("/bookAppointments/{patientId}")
	public Appointment bookAppointment(@PathVariable String patientId, @RequestBody Appointment appointment) {
		return patientServ.bookAppointment(patientId, appointment);
	}
	
	@GetMapping("/viewAppointments/{patientId}")
	public Appointment viewAppointments(@PathVariable String patientId) {
		return patientServ.viewAppointments(patientId);
	}
	
	@DeleteMapping("/deleteAppointment/{appointmentId}")
	public Appointment deleteAppointment(@PathVariable String appointmentId) {
		return patientServ.deleteAppointment(appointmentId);
	}
	
}
