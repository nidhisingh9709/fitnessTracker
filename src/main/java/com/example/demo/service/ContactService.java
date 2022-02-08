package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Contacts;
import com.example.demo.repository.ContactRepository;

@Service
public class ContactService {

	@Autowired
	ContactRepository contactRepository;
	
	public Iterable<Contacts> getContact() {
		// TODO Auto-generated method stub
		return contactRepository.findAll();
	}
	
}
