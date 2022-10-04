package com.example.demo.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormController {
	
	@RequestMapping("/")
	public String omikujiForm() {
		return "index.jsp";
	}
	
	@RequestMapping("/show")
	public String show(
			@RequestParam(value="years") String years,
			@RequestParam(value="city") String city,
			@RequestParam(value="person") String person,
			@RequestParam(value="hobby") String hobby,
			@RequestParam(value="thing") String thing,
			@RequestParam(value="nice") String nice,
			Model model,
			HttpSession session
			) {
		session.setAttribute("years",years);
		session.setAttribute("city",city);
		session.setAttribute("person",person);
		session.setAttribute("hobby",hobby);
		session.setAttribute("thing",thing);
		session.setAttribute("nice",nice);
//		model.addAttribute("city",city);
//		model.addAttribute("person",person);
//		model.addAttribute("hobby",hobby);
//		model.addAttribute("thing",thing);
//		model.addAttribute("nice",nice);
		return "show.jsp";
	}
}
