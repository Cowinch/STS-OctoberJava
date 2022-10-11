package com.cole.loginreg.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.cole.loginreg.services.UserService;

@Controller
public class MainController {
	
	@Autowired
	private UserService userServ;
	
	@RequestMapping("/")
	public String redirect() {
		return "redirect:user/login/register";
	}
	
	@GetMapping("/dashboard")
	public String dashboard(HttpSession session, Model model) {
		// If no user_id is found, redirect to logout
		if(session.getAttribute("user_id") == null) {
			return "redirect:/logout";
		}
				
		// We get the user_id from our session
		//If we get an error, it means we past the whole object. Don't do that, just use .getID()
		Long userId = (Long) session.getAttribute("user_id");
		model.addAttribute("user", userServ.findById(userId));
		return "index.jsp";
	}
}
