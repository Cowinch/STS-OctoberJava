package com.cole.savetravels.repositories;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.cole.savetravels.models.Expense;

@Repository
public interface ExpenseRepository extends CrudRepository<Expense, Long>{
	// this method retrieves all the books from the database
    List<Expense> findAll();
    // this method finds books with descriptions containing the search string
    List<Expense> findByDescriptionContaining(String search);
    // this method counts how many titles contain a certain string
    Long countByNameContaining(String search);
    // this method deletes a book that starts with a specific title
    Long deleteByNameStartingWith(String search);
}
