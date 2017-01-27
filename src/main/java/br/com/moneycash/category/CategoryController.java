package br.com.moneycash.category;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.composed.web.Get;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CategoryController {

	@Autowired
	CategoryRepository categoryRepository;
	
	@Get("/categories")
	public ModelAndView list() {
		ModelAndView mav = new ModelAndView("categories/list");

		List<Category> categories = categoryRepository.findAll();
		
		mav.addObject("categories", categories);
		return mav;
	}
}
