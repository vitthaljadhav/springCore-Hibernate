package com.info.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.type.TrueFalseType;

import com.info.model.id.StudentId;
@Entity
@Table(name = "TBL_STUD")
public class Student implements Serializable {

	@Id
	@Embedded
	private StudentId id;

	@Column(name = "FIRST_NAME" ,nullable = true ,length = 45)
	private String firstName;

	@Column(name = "LAST_NAME")
	private String lastName;

	@Column(name = "CIRY")
	private String city;

	@Column(name = "PINCODE")
	private String pincode;

	public StudentId getId() {
		return id;
	}

	public void setId(StudentId id) {
		this.id = id;
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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public Student(StudentId id, String firstName, String lastName, String city, String pincode) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.city = city;
		this.pincode = pincode;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", city=" + city
				+ ", pincode=" + pincode + "]";
	}
}
