package com.example.demo.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
public class Appointment {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer contactId;

	@NotBlank(message = "Please enter name")
	private String name;

	@NotBlank(message = "age field can't be empty")
	private String age;

	@NotBlank
	@Column(unique = true)
	@Email(message = "entered email is not a valid email")
	private String email;

	@NotBlank
	@Column(unique = true)
	@Pattern(regexp = "^[0-9]{10}$", message = "Mobile number cannot be greater than 10gigits")
	private String mobileNumber;

	@NotBlank
	@Pattern(regexp = "^[a-zA-Z0-9 #&%,]*$")
	private String addressLine1;

	@NotBlank
	private String addressLine2;

	@NotBlank
	private String city;

	@NotBlank(message = "Enter the state to which you belong")
	private String state;

	@NotBlank(message = "please enter the country to which you belong")
	@Pattern(regexp = "^[a-zA-Z ]*$")
	private String country;

	@NotBlank
	@Pattern(regexp = "^[0-9]*$")
	@Size(max = 8)
	private String pin;

	@NotBlank(message = "please provide us your trainer preference")
	private String trainerPreference;

	@NotBlank(message = "This field can contain only yes or no")
	@Enumerated(EnumType.STRING)
	private physiotherapistRequired physio;

	@NotBlank(message = "please select a package")
	private String packageSelected;

	@NotBlank
	private String weeks;

	private double amount;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "feedback_id", referencedColumnName = "id")
	private Contacts contacts;

	public Appointment() {

	}

	public Appointment(Integer contactId, @NotBlank(message = "Please enter name") String name,
			@NotBlank(message = "age field can't be empty") String age,
			@NotBlank @Email(message = "entered email is not a valid email") String email,
			@NotBlank @Pattern(regexp = "^[0-9]{10}$", message = "Mobile number cannot be greater than 10gigits") String mobileNumber,
			@NotBlank @Pattern(regexp = "^[a-zA-Z0-9 #&%,]*$") String addressLine1, @NotBlank String addressLine2,
			@NotBlank String city, @NotBlank(message = "Enter the state to which you belong") String state,
			@NotBlank(message = "please enter the country to which you belong") @Pattern(regexp = "^[a-zA-Z ]*$") String country,
			@NotBlank @Pattern(regexp = "^[0-9]*$") @Size(max = 8) String pin,
			@NotBlank(message = "please provide us your trainer preference") String trainerPreference,
			@NotBlank(message = "This field can contain only yes or no") physiotherapistRequired physio,
			@NotBlank(message = "please select a package") String packageSelected, @NotBlank String weeks,
			double amount, Contacts contacts) {
		super();
		this.contactId = contactId;
		this.name = name;
		this.age = age;
		this.email = email;
		this.mobileNumber = mobileNumber;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.city = city;
		this.state = state;
		this.country = country;
		this.pin = pin;
		this.trainerPreference = trainerPreference;
		this.physio = physio;
		this.packageSelected = packageSelected;
		this.weeks = weeks;
		this.amount = amount;
		this.contacts = contacts;
	}

	public Integer getContactId() {
		return contactId;
	}

	public void setContactId(Integer contactId) {
		this.contactId = contactId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	public String getTrainerPreference() {
		return trainerPreference;
	}

	public void setTrainerPreference(String trainerPreference) {
		this.trainerPreference = trainerPreference;
	}

	public physiotherapistRequired getPhysio() {
		return physio;
	}

	public void setPhysio(physiotherapistRequired physio) {
		this.physio = physio;
	}

	public String getPackageSelected() {
		return packageSelected;
	}

	public void setPackageSelected(String packageSelected) {
		this.packageSelected = packageSelected;
	}

	public String getWeeks() {
		return weeks;
	}

	public void setWeeks(String weeks) {
		this.weeks = weeks;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Contacts getContacts() {
		return contacts;
	}

	public void setContacts(Contacts contacts) {
		this.contacts = contacts;
	}

}
