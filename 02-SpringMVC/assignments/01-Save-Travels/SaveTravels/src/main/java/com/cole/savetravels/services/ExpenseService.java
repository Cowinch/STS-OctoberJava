package com.cole.savetravels.services;

import java.util.ArrayList;
import java.util.Optional;
import org.springframework.stereotype.Service;
import com.cole.savetravels.models.Expense;
import com.cole.savetravels.repositories.ExpenseRepository;

@Service
public class ExpenseService {
	private final ExpenseRepository expenseRepo;
	
	public ExpenseService(ExpenseRepository expenseRepo) {
		this.expenseRepo=expenseRepo;
	}
	
	// returns all the expenses
    public ArrayList<Expense> allExpenses() {
        return (ArrayList<Expense>) expenseRepo.findAll();
    }
    
    // creates an expense
    public Expense createExpense(Expense b) {
        return expenseRepo.save(b);
    }
    
    // retrieves a single expense
    public Expense findExpense(Long id) {
        Optional<Expense> optionalExpense = expenseRepo.findById(id);
        if(optionalExpense.isPresent()) {
            return optionalExpense.get();
        } else {
            return null;
        }
    }
    
    // edit expense
    public Expense updateExpense(Expense expense) {
    	return expenseRepo.save(expense);
    }
    
    //delete expense
    public void deleteExpense(Long id) {
    	expenseRepo.deleteById(id);
    }
}
