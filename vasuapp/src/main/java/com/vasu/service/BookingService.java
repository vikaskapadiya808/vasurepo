package com.vasu.service;

import java.text.ParseException;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

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
		Long mobileNumber;
        String senderMailAddress="vikaskapadiya808@gmail.com";
        String senderPassword="Spring@8857";
        
        String reciepientMailAddress="vikaj808@gmail.com";
        
        
		try {
			CustomerDetailEntity customerDetailEntity = new CustomerDetailEntity();
			customerDetailEntity.setCity(customerDetailForm.getCity());
			customerDetailEntity.setMobileNumber(Long.parseLong(customerDetailForm.getMobileNumber()));
			customerDetailEntity.setBookingDate(customerDetailForm.getBookingDate());
			customerDetailEntity.setName(customerDetailForm.getName());
			customerDetailEntity.setAddress(customerDetailForm.getAddress());
			customerDetailEntity.setState(customerDetailForm.getState());
			customerDetailEntity.setPin(customerDetailForm.getPin());
			customerDetailEntity.setTimeSlot(customerDetailForm.getTimeSlot());
			mobileNumber = bookingRepository.save(customerDetailEntity).getMobileNumber();

			Properties props=new Properties();
			props.setProperty("mail.smpt.auth","true");
			props.setProperty("mail.smpt.starttls.enable", "true");
			props.setProperty("mail.smtp.host", "smtp.gmail.com");
			props.setProperty("mail.smtp.port", "587");
			
			Session session=Session.getDefaultInstance(props, new Authenticator() {
				@Override
				protected PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication(senderMailAddress, senderPassword);
				}
			});
			
			
			Message message=new MimeMessage(session);
			message.setFrom(new InternetAddress());
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(reciepientMailAddress));
			
			message.setSubject("Welcome mail");
			message.setText("Hi vikas,  \n \n Welcome to Terrapay, have a good day");
			
			Transport.send(message);
			System.out.println("Email sent successfully");

			return mobileNumber;
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e.getMessage());
		}

	}
}
