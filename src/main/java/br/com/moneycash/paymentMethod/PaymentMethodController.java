package br.com.moneycash.paymentMethod;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.composed.web.Get;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PaymentMethodController {

	@Autowired
	private PaymentMethodRepository paymentMethodRepository;
	
	@Get("/paymentmethod")
	public ModelAndView list(){
		ModelAndView mav = new ModelAndView("paymentMethod/list");
		
		List<PaymentMethod> paymentMethods = paymentMethodRepository.findAll();
		
		mav.addObject("paymentMethods", paymentMethods);
		return mav;
	}
}
