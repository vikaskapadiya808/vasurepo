package com.vasu.service;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vasu.entities.CustomerDetailEntity;
import com.vasu.model.CustomerDetailForm;
import com.vasu.repository.BookingRepository;

@Service
public class BookingService {

	@Autowired
	private BookingRepository bookingRepository;
	

	
	@Transactional(readOnly = false)
	public Long bookCarWash(CustomerDetailForm customerDetailForm) throws ParseException {
		CustomerDetailEntity customerDetailEntity=new CustomerDetailEntity();
		customerDetailEntity.setCity(customerDetailForm.getCity()); 
		customerDetailEntity.setMobileNumber(Long.parseLong(customerDetailForm.getMobileNumber())); 
		customerDetailEntity.setBookingDate(customerDetailForm.getBookingDate()); 
		customerDetailEntity.setName(customerDetailForm.getName()); 
		customerDetailEntity.setAddress(customerDetailForm.getAddress()); 
		customerDetailEntity.setState(customerDetailForm.getState()); 
		customerDetailEntity.setPin(customerDetailForm.getPin());
		customerDetailEntity.setTimeSlot(customerDetailForm.getTimeSlot());
		return bookingRepository.save(customerDetailEntity).getMobileNumber();
		
	}
}
