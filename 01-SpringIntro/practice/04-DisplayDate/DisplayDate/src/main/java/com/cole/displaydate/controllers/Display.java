package com.cole.displaydate.controllers;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Display {
	Date date = new Date();
	
	@RequestMapping("")
	public String dahboard() {
		return "index.jsp";
	}
	
	@RequestMapping("/date")
	public String date(Model model) {
		SimpleDateFormat dayNameFormat = new SimpleDateFormat("EEEE");
    	SimpleDateFormat dayFormat = new SimpleDateFormat("dd");
    	SimpleDateFormat monthFormat = new SimpleDateFormat("MMMM");
    	SimpleDateFormat yearFormat = new SimpleDateFormat("Y");
    	
    	String dayNameString = dayNameFormat.format(date);
    	String dayString = dayFormat.format(date);
    	String monthString = monthFormat.format(date);
    	String yearString = yearFormat.format(date);
    	
    	String dateString = dayNameString + ", " + "the " + dayString + " of " + monthString + ", " + yearString;
		model.addAttribute("date", dateString);
		return "date.jsp";
	}
	
	@RequestMapping("/time")
	public String time(Model model) {
		SimpleDateFormat hourFormat = new SimpleDateFormat("h");
		SimpleDateFormat minuteFormat = new SimpleDateFormat("mm");
		SimpleDateFormat ampmFormat = new SimpleDateFormat("a");
		
		String hourString=hourFormat.format(date);
		String minuteString=minuteFormat.format(date);
		String ampmString=ampmFormat.format(date);
		
		String timeString=hourString+ ":"+minuteString+" "+ampmString;
		model.addAttribute("date", timeString);
		return "date.jsp";
	}
}
