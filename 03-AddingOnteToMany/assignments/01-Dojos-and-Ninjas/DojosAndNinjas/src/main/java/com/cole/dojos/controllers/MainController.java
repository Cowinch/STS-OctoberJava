package com.cole.dojos.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.cole.dojos.models.Dojo;
import com.cole.dojos.models.Ninja;
import com.cole.dojos.services.DojoService;
import com.cole.dojos.services.NinjaService;

@Controller
public class MainController {
	@Autowired
	DojoService dojoService;
	
	@Autowired
	NinjaService ninjaService;
	
	@GetMapping("/dojos")
	public String index(@ModelAttribute("dojo") Dojo dojo, Model model) {
		model.addAttribute("dojos", dojoService.allDojos());
		return "index.jsp";
	}
	
	@PostMapping("/dojos/create")
	public String createDojo(@ModelAttribute("dojo") Dojo dojo, BindingResult result) {
		if(result.hasErrors()) {
			return "index.jsp";
		}
		dojoService.addDojo(dojo);
		return "index.jsp";
	}
	
	@GetMapping("/dojos/{id}")
	public String displayOneDojo(@PathVariable("id") Long id, @ModelAttribute("ninja") Ninja ninja, Model model) {
		List<Ninja> ninjas = ninjaService.dojoNinjas(id);
		List<Ninja> allNinjas=ninjaService.allNinjas();
		Dojo dojo = dojoService.findDojo(id);
		model.addAttribute("ninjas", ninjas);
		model.addAttribute("allNinjas",allNinjas);
		model.addAttribute("dojo",dojo);
		return "oneDojo.jsp";
	}
	
	@GetMapping("/ninja/create")
	public String newNinja(@ModelAttribute("ninja") Ninja ninja, Model model) {
		model.addAttribute("dojos", dojoService.allDojos());
		return "createNinja.jsp";
	}
	
	@PostMapping("/ninja/create")
	public String createNinja(@ModelAttribute("ninja") Ninja ninja, BindingResult result) {
		if(result.hasErrors()) {
			return "index.jsp";
		}
		Ninja newNinja = ninjaService.addNinja(ninja);
		return "redirect:/dojos/"+newNinja.getDojo().getId();
	}
}
