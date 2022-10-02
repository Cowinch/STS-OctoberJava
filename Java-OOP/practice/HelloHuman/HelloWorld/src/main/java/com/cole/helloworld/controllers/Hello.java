package com.cole.helloworld.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
	@RequestMapping("")
	public String hello(
			@RequestParam(value="first_name", required=false) String firstName, 			@RequestParam(value="last_name", required=false) String lastName, 
			@RequestParam(value="times", required=false) Integer times) {
		String returnString="";
		if(times==null) {
			times=1;
		}
		if(firstName!=null) {
			if(lastName!=null) {
				for(int i=0;i<times;i++) {			
					returnString+= "Hello " + firstName + " " + lastName + " ";
				}
				return returnString;
			}
			for(int i=0;i<times;i++) {
				returnString+= "Hello " + firstName + " ";
			}
			return returnString;
		}
		return "Hello Human ";
	}
}
