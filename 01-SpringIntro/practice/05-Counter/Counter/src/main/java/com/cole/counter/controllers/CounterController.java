package com.cole.counter.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

// unable to get the counter to update with the refresh

@Controller
public class CounterController {
	int counter=0;
	boolean doubleTime=false;
	@RequestMapping("/")
	public String welcome(HttpSession session, Model model) {
		doubleTime=false;
		if(session.getAttribute("count")==null) {
			session.setAttribute("count", 0);
		} else {
			counter=(int) session.getAttribute("count");
			counter++;
			session.setAttribute("count", counter);
		}
		
		model.addAttribute("count", counter);
		model.addAttribute("bigText", "Welcome User!");
		model.addAttribute("doubleTime", doubleTime);
		return "index.jsp";
	}
	@RequestMapping("/reset")
	public String Reset(HttpSession session) {
		session.removeAttribute("count");
		if(doubleTime==true) {
			return "redirect:/double";
		}
		return "redirect:/";
	}
	@RequestMapping("/double")
	public String doubleTime(HttpSession session, Model model) {
		doubleTime=true;
		if(session.getAttribute("count")==null) {
			session.setAttribute("count", 0);
		} else {
			counter=(int) session.getAttribute("count");
			counter+=2;
			session.setAttribute("count", counter);
		}
		
		model.addAttribute("count", counter);
		model.addAttribute("bigText", "DOUBLE TIME!");
		model.addAttribute("doubleTime", doubleTime);
		return "index.jsp";
	}
}
