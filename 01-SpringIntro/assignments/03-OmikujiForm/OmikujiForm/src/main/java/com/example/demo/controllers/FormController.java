package com.example.demo.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

// are all those strings being stored under "error" or being overwritten. Can I loop through all of those values

@Controller
public class FormController {
	
	@RequestMapping("/")
	public String omikujiForm() {
		return "index.jsp";
	}
	
	@RequestMapping("/process")
	public String process(
			@RequestParam(value="years") String years,
			@RequestParam(value="city") String city,
			@RequestParam(value="person") String person,
			@RequestParam(value="hobby") String hobby,
			@RequestParam(value="thing") String thing,
			@RequestParam(value="nice") String nice,
			Model model,
			HttpSession session,
			RedirectAttributes redirectAttributes
			) {
		boolean isValid=true;
		if(nice.length()<1) {
			redirectAttributes.addFlashAttribute("error", "Nice cannot be blank");
			isValid=false;
			
		}
		if(thing.length()<1) {
			redirectAttributes.addFlashAttribute("error", "Living thing cannot be blank");
			isValid=false;
			
		}
		if(hobby.length()<1) {
			redirectAttributes.addFlashAttribute("error", "Hobby cannot be blank");
			isValid=false;
			
		}
		if(person.length()<1) {
			redirectAttributes.addFlashAttribute("error", "Real person cannot be blank");
			isValid=false;
			
		}
		if(city.length()<1) {
			redirectAttributes.addFlashAttribute("error", "City cannot be blank");
			isValid=false;
			
		}
		if(years.length()<1) {
			redirectAttributes.addFlashAttribute("error", "Years cannot be blank");
			isValid=false;
			
		}
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
		if(isValid==true) {		
			return "redirect:/show";
		}
		return "redirect:/";
	}
	
	@RequestMapping("/show")
	public String show() {
		return "show.jsp";
	}
}
