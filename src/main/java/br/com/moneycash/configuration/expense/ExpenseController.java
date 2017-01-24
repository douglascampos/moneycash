package br.com.moneycash.configuration.expense;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.composed.web.Get;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ExpenseController {
	
	@Autowired
	private ExpenseRepository expenseRepository;

	@Get("/expenses")
	public ModelAndView list() {
		ModelAndView mav = new ModelAndView("expenses/list");
		
		List<Expense> expenses = expenseRepository.findAll();
		
		mav.addObject("expenses", expenses);
		return mav;
	}
}
