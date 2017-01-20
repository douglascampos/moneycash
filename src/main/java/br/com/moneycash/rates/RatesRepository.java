package br.com.moneycash.rates;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.RepositoryDefinition;

@RepositoryDefinition(domainClass = Rate.class, idClass = Long.class)
public interface RatesRepository {
	
	Optional<Rate> findByYear(Integer year);
	
	List<Rate> findAll();
	
	Rate save(Rate rate);

}
