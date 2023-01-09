package com.masai.webapp.example.entity;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

@Entity
public class Fir {
	@Id
	@GeneratedValue
	public int FirId;
	
	@Pattern(regexp="^[A-Z][a-z]*", message = "{fname.invalid}")
	public String firstName;
	
	@Pattern(regexp="^[A-Z][a-z]*", message = "{lname.invalid}")
	public String lastName;
	
	@Size(min=10, max=10, message = "{mobile.invalid}")
	public  String mobileNumber;
	
	
	public String address;
	
	@Min(8)
	public int age;
	
	@Pattern(regexp = "(?:male|Male|MALE|female|Female|FEMALE|Transgender|transgender|TRANSGENDER)$", message = "{gender.invalid}")
	public String gender;
	
	
	public String password;
	
	Fir(){}

	public Fir(int firId, @Pattern(regexp = "^[A-Z][a-z]*", message = "{name.invalid}") String firstName,
			@Pattern(regexp = "^[A-Z][a-z]*", message = "{name.invalid}") String lastName,
			@Size(min = 10, max = 10, message = "{mobile.invalid}") String mobileNumber, String address,
			@Size(min = 8, message = "{age.invalid}") int age,
			@Pattern(regexp = "(?:male|Male|MALE|female|Female|FEMALE|Transgender|transgender|TRANSGENDER)$", message = "{gender.invalid}") String gender,
			 String password) {
		super();
		FirId = firId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobileNumber = mobileNumber;
		this.address = address;
		this.age = age;
		this.gender = gender;
		this.password = password;
	}

	public int getFirId() {
		return FirId;
	}

	public void setFirId(int firId) {
		FirId = firId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Fir [FirId=" + FirId + ", firstName=" + firstName + ", lastName=" + lastName + ", mobileNumber="
				+ mobileNumber + ", address=" + address + ", age=" + age + ", gender=" + gender + ", password="
				+ password + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(FirId, address, age, firstName, gender, lastName, mobileNumber, password);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Fir))
			return false;
		Fir other = (Fir) obj;
		return FirId == other.FirId && Objects.equals(address, other.address) && age == other.age
				&& Objects.equals(firstName, other.firstName) && Objects.equals(gender, other.gender)
				&& Objects.equals(lastName, other.lastName) && Objects.equals(mobileNumber, other.mobileNumber)
				&& Objects.equals(password, other.password);
	}
	

}
