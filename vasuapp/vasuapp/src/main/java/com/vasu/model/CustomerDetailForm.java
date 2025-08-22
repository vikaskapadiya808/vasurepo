package com.vasu.model;

import java.time.LocalDate;

import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

/**
 * 
 */
public class CustomerDetailForm  {

	@NotBlank(message = "Name must not be blank")
	private String name;
	@NotBlank(message = "mobileNumber must not be blank")
	private String mobileNumber;
	@NotBlank(message = "address must not be blank")
	private String address;
	@NotBlank(message = "city must not be blank")
	private String city;
	@NotBlank(message = "state must not be blank")
	private String state;
	@Min(value = 100000, message = "pin must be at least 100000")
	@Max(value = 999999, message = "pin must be at most 999999")
	@NotNull(message = "pin must not be null")
	private Integer pin;
	@NotNull(message = "bookingDate must not be blank")
	@FutureOrPresent(message = "Date must be todays or furtue")
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	private LocalDate bookingDate;
	@NotBlank(message = "time slot must not be blank")
	private String timeSlot;

	public String getTimeSlot() {
		return timeSlot;	
	}

	public void setTimeSlot(String timeSlot) {
		this.timeSlot = timeSlot;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	@Override
	public String toString() {
		return "CustomerDetailForm [name=" + name + ", mobileNumber=" + mobileNumber + ", address=" + address
				+ ", city=" + city + ", state=" + state + ", pin=" + pin + ", bookingDate=" + bookingDate + "]";
	}

	
}
