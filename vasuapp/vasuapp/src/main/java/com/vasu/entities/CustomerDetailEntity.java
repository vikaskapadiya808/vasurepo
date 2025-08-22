package com.vasu.entities;

import java.sql.Date;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="customer_details")
public class CustomerDetailEntity {
	
	@Id
	@Column(name = "mobile_nbr")
	private Long mobileNumber;
	
	@Column(name = "name")
	private String name;
	
	private String address;
	
	private String city;
	
	private String state;

	@Column(name = "pin")
	private Integer pin;
	
	@Column(name = "booking_dt")
	@DateTimeFormat(pattern = "dd-MM-yyyy")
	private LocalDate bookingDate;

	@Column(name = "time_slot")
	private String timeSlot;

	public Long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(Long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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

	

	public Integer getPin() {
		return pin;
	}

	public void setPin(Integer pin) {
		this.pin = pin;
	}

	

	public LocalDate getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(LocalDate bookingDate) {
		this.bookingDate = bookingDate;
	}

	public String getTimeSlot() {
		return timeSlot;
	}

	public void setTimeSlot(String timeSlot) {
		this.timeSlot = timeSlot;
	}

	@Override
	public String toString() {
		return "CustomerDetailEntity [mobileNumber=" + mobileNumber + ", name=" + name + ", address=" + address
				+ ", city=" + city + ", state=" + state + ", pin=" + pin + ", bookingDate=" + bookingDate
				+ ", timeSlot=" + timeSlot + "]";
	}

	
}
