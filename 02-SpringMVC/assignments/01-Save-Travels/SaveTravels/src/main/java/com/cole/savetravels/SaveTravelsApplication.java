package com.cole.savetravels;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class SaveTravelsApplication {
	@GetMapping("/")
	public String redirect() {
		return "redirect:/expenses";
	}

	public static void main(String[] args) {
		SpringApplication.run(SaveTravelsApplication.class, args);
	}

}
