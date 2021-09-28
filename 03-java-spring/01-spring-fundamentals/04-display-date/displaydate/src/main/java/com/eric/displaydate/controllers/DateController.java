package com.eric.displaydate.controllers;

import java.sql.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DateController {
	private Date getDate() {
		Date now = (Date) new java.util.Date();
		return now;
	}
	
	@RequestMapping("/")
	public String index() {
		return "date.jsp";
	} 
	@RequestMapping("/time")
	public String time(Model viewModel) {
		viewModel.addAttribute("datetime", getDate());
		return "time.jsp";
	}
	@RequestMapping("/date")
	public String date(Model viewModel) {
		viewModel.addAttribute("datetime", getDate());
		return "otherdate.jsp";
	}

}
