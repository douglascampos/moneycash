package br.com.moneycash.category;

import java.util.List;

import org.springframework.data.repository.RepositoryDefinition;

import br.com.moneycash.configuration.expense.Expense;

@RepositoryDefinition(domainClass = Category.class, idClass = Long.class)
public interface CategoryRepository {
	
	List<Category> findAll();
}
