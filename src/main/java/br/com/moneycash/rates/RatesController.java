package br.com.moneycash.rates;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.composed.web.Get;
import org.springframework.composed.web.Post;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RatesController {
	
	@Autowired
	private ConsultFees<BankRates> fees;
	
	@Get("/rates")
	public ModelAndView list() {
		ModelAndView mav = new ModelAndView("rates/list");
		
		List<BankRates> ratesCB = fees.getRatesCB();
		
		mav.addObject("rates", ratesCB);

		return mav;
	}

}
