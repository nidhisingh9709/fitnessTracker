package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
public class Contacts {
	@Id
	private Integer id;

	@NotBlank
	@Pattern(regexp="^[a-zA-Z ]$")
	private String name;
	
	@NotBlank
	@Email
	private String email;
	@NotBlank
	@Pattern(regexp="^[0-9]{10}$")
	private String phone;
	
	@NotBlank
	@Size(max=200)
	private String message;
	
	@OneToOne(mappedBy="contacts")
	private Appointment appointment;
	
	public Contacts() {
		
	}
	

	public Contacts(@NotBlank @Pattern(regexp = "^[a-zA-Z ]$") String name, @NotBlank @Email String email,
			@NotBlank @Pattern(regexp = "^[0-9]{10}$") String phone, @NotBlank @Size(max = 200) String message) {
		super();
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.message = message;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
