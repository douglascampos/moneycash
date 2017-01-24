package br.com.moneycash.configuration.expense;

import java.util.List;

import org.springframework.data.repository.RepositoryDefinition;

@RepositoryDefinition(domainClass = Expense.class, idClass = Long.class)
public interface ExpenseRepository {
	
	List<Expense> findAll();

}
