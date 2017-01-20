package br.com.moneycash.rates;

import java.util.List;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.composed.web.Get;
import org.springframework.composed.web.Post;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

import br.com.moneycash.user.UserRepository;

@Controller
public class RatesController {
	
	@Autowired
	private ConsultFees<BankRates> fees;
	
	@Autowired
	private RatesRepository ratesRepository;
	
	@Get("/rates")
	public ModelAndView list() {
		ModelAndView mav = new ModelAndView("rates/list");
		
		List<Rate> allRates = ratesRepository.findAll();
		
		List<BankRates> ratesCB = fees.getRatesCB();
		
		mav.addObject("rates", ratesCB);
		mav.addObject("allRates", allRates);

		return mav;
	}
	
	@Get("/rates/create")
	public ModelAndView showCreateForm(){
		ModelAndView mav = new ModelAndView("rates/createRate");
		return mav;
	}
	
	@Post("/rates/create")
	public ModelAndView createRate(@NotBlank String name, @NotBlank Integer year, @NotBlank Integer month, @NotBlank double tx) {
		ModelAndView mav = new ModelAndView("redirect:/rates");
		// TODO: Adicionar validação
		Rate rate = new Rate(name, year, month, tx);
		ratesRepository.save(rate);
		
		
		return mav;
	}
	
	

}
