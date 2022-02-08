package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Appointment;

@Repository
public interface AppointmentRepository  extends CrudRepository<Appointment,Integer>{

	Optional<Appointment> findByEmail(String email);

}
