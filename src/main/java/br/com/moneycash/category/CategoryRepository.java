package br.com.moneycash.category;

import java.util.List;

import org.springframework.data.repository.RepositoryDefinition;

@RepositoryDefinition(domainClass = Category.class, idClass = Long.class)
public interface CategoryRepository {
	
	List<Category> findAll();
}
