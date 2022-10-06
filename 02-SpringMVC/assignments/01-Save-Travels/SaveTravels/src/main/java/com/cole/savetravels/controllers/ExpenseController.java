package com.cole.savetravels.controllers;

import java.util.ArrayList;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.cole.savetravels.models.Expense;
import com.cole.savetravels.services.ExpenseService;

@Controller
public class ExpenseController {
	
	@Autowired
	ExpenseService expenseService;
	
	@GetMapping("/expenses")
	public String homePage(@ModelAttribute("expense") Expense expense, Model model) {
		ArrayList<Expense> expenses = expenseService.allExpenses();
		model.addAttribute("expenses", expenses);
		return "index.jsp";
	}
	
	@PostMapping("/expenses")
	public String index(@Valid @ModelAttribute("expense") Expense expense, BindingResult result, Model model) {
		if(result.hasErrors()) {
			ArrayList<Expense> expenses = expenseService.allExpenses();
			model.addAttribute("expenses", expenses);
			return "index.jsp";
		}else {
			expenseService.createExpense(expense);
			return "redirect:/expenses";
		}
	}
	
	@GetMapping("/view/{id}")
	public String displayOne(@PathVariable("id") Long id, Model model) {
		Expense expense = expenseService.findExpense(id);	
		model.addAttribute("expense", expense);
		return "show.jsp";
	}
	
	@GetMapping("/edit/{id}")
	public String show(@PathVariable("id") Long id, Model model) {	
		Expense expense = expenseService.findExpense(id);	
		model.addAttribute("expense", expense);
		return "edit.jsp";
	}
	
	@PutMapping("/edit/{id}")
	public String update(
			@PathVariable("id") Long id, 
			Model model, 
			@Valid @ModelAttribute("expense") Expense expense, 
			BindingResult result) {
		if(result.hasErrors()) {
			return "redirect:/edit/{id}";
		}else {
			expenseService.updateExpense(expense);
			return "redirect:/expenses";
		}
	}
	
	@DeleteMapping("/delete/{bookId}")
	public String deleto(@PathVariable("bookId") Long bookId) {
		expenseService.deleteExpense(bookId);
		return "redirect:/";
	}
}
