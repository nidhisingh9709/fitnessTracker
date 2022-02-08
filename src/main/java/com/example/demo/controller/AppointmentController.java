package com.example.demo.controller;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Appointment;
import com.example.demo.service.AppointmentService;

@RestController
public class AppointmentController {

	@Autowired
	AppointmentService appointmentService;
	
	@GetMapping("/appointments")
	public Iterable<Appointment>getAppointments(){
		return appointmentService.getAppointments();
	}
	@GetMapping("/appointments/{email}")
	public Optional<Appointment> getAppointment(@PathVariable("email") String email){
		return appointmentService.getAppointment(email);
	}
	@PostMapping("/appointments")
	@ResponseStatus(code = HttpStatus.CREATED)
	public void addAppointment(@RequestBody @Valid Appointment appointment) {
		appointmentService.addAppointment(appointment);
	}
	
	@DeleteMapping("/appointments/{id}")
	public void deleteAppointment(@PathVariable("id") Integer id) {
		appointmentService.deleteAppointment(id);
	}
	
	@PutMapping("/appointments/{id}")
	public void updateAppointment(@PathVariable("id") Integer id, Appointment appointment) {
	appointmentService.updateAppoinment(id,appointment);
}
}
