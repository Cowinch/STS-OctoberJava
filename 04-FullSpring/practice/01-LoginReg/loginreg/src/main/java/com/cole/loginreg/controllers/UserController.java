package com.cole.loginreg.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cole.loginreg.models.LoginUser;
import com.cole.loginreg.models.User;
import com.cole.loginreg.services.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	public final UserService userServ;
	public UserController(UserService userServ) {
		this.userServ=userServ;
	}
	
	@GetMapping("/login/register")
	public String loginRegPage(Model model) {
		model.addAttribute("newUser", new User());
		model.addAttribute("loginUser", new LoginUser());
		return "loginReg.jsp";
	}
	
	@PostMapping("/register")
	public String registerUser(
			@Valid @ModelAttribute("newUser") User newUser,
			BindingResult result,
			Model model,
			HttpSession session) {
		//reject if email is taken
		if(userServ.getUser(newUser.getEmail())!=null) {
			result.rejectValue("email", "Email already in use");
		}
		
		//reject if passwords don't match
		if(!newUser.getPassword().equals(newUser.getConfirm())) {
			result.rejectValue("confirm", "Passwords must match");
		}
		
		//if there are any errors, return the page and display errors
		if(result.hasErrors()) {
			model.addAttribute("loginUser", new LoginUser());
			return "loginReg.jsp";
		}
		User createdUser = userServ.registerUser(newUser);
		session.setAttribute("user_id", createdUser.getId());
		return "redirect:/dashboard";
	}
	
	@PostMapping("/login")
	public String loginUser(
			@Valid @ModelAttribute("loginUser") LoginUser loginUser,
			BindingResult result,
			Model model,
			HttpSession session) {
		if(result.hasErrors()) {
			model.addAttribute("newUser",new User());
			return "loginReg.jsp";
		}
		User foundUser=userServ.login(loginUser, result);
		if(foundUser==null) {
			model.addAttribute("newUser",new User());
			return "loginReg.jsp";
		}
		//specfically getId, do not pass the whole object into the session!
		session.setAttribute("user_id", foundUser.getId());
		return "redirect:/dashboard";
		
	}
	
	@GetMapping("/logout")
	public String logout(HttpSession session) {
	 
		// Set user_id to null and redirect to login/register page
		session.setAttribute("user_id", null);
	     
	    return "redirect:/user/login/register";
	}
	
	

}
