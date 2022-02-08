package com.example.demo.service;

import java.util.Optional;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Appointment;
import com.example.demo.repository.AppointmentRepository;

@Service
public class AppointmentService {

	@Autowired
	AppointmentRepository appointmentRepository;

	public Iterable<Appointment> getAppointments() {
		// TODO Auto-generated method stub
		return appointmentRepository.findAll();
	}

	public Optional<Appointment> getAppointment(String email) {
		// TODO Auto-generated method stub
		return appointmentRepository.findByEmail(email);
	}

	@Transactional
	public void addAppointment(@Valid Appointment appointment) {
		// TODO Auto-generated method stub
		appointmentRepository.save(appointment);
	}

	@Transactional
	public void deleteAppointment(Integer id) {
		// TODO Auto-generated method stub
		appointmentRepository.deleteById(id);
	}

	@Transactional
	public void updateAppoinment(Integer id, Appointment appointment) {
		// TODO Auto-generated method stub
		appointmentRepository.save(appointment);
	}
}
