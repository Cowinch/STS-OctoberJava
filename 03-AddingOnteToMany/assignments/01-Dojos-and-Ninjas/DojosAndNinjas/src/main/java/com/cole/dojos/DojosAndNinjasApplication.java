package com.cole.dojos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class DojosAndNinjasApplication {
	@GetMapping("/")
	public String redirect() {
		return "redirect:/dojos";
	}

	public static void main(String[] args) {
		SpringApplication.run(DojosAndNinjasApplication.class, args);
	}

}
