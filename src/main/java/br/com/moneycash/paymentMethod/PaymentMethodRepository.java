package br.com.moneycash.paymentMethod;

import java.util.List;

import org.springframework.data.repository.RepositoryDefinition;

import br.com.moneycash.configuration.expense.Expense;

@RepositoryDefinition(domainClass = PaymentMethod.class, idClass = Long.class)
public interface PaymentMethodRepository {
	
	List<PaymentMethod> findAll();
}
