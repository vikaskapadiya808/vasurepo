package com.vasu.controller;

import java.text.ParseException;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.vasu.model.CustomerDetailForm;
import com.vasu.service.BookingService;

@Controller
public class MainController {
	
	@Autowired
	private BookingService bookingService;

	
	@GetMapping("/")
	public String showHome() {
		return "home";
	}
	
	@GetMapping("/book")
	public String showForm(Model model) {
		CustomerDetailForm customerDetailForm=new CustomerDetailForm();
		model.addAttribute("customerDetailForm", customerDetailForm);
		return "home";
	}
	
	
	@PostMapping("/bookForCarWash")
	public String bookForCarWash(@Valid @ModelAttribute("customerDetailForm")  CustomerDetailForm customerDetailForm,BindingResult bindingResult,Model model) throws ParseException {
		model.addAttribute("mobileNumber", customerDetailForm.getMobileNumber());
		  if(bindingResult.hasErrors()) {
			  return "home";
		  }
		Long mobileNumber = bookingService.bookCarWash(customerDetailForm);
		if(mobileNumber!=0) {
			return "booking-success";
		}
		else {
			return "error";
		}
	}
}
