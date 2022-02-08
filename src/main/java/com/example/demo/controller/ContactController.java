package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Contacts;
import com.example.demo.service.ContactService;

@RestController
public class ContactController {

	@Autowired
	ContactService contactService;
	
	@GetMapping("/contacts")
	public Iterable<Contacts> getContact(){
		return contactService.getContact();
	}
}
