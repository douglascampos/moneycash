package br.com.moneycash.rates;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ConsultFees<T> {
	
	@Autowired
	private RatesRepository ratesRepository;
	
	 public List<BankRates> getRatesCB() {
		
		BankRates rate01 = new BankRates();
		rate01.setAnnualInterest(27.34);
		rate01.setMonthlyInterest(2.03);
		rate01.setName("Sofisa");
		rate01.setPosition(1);
		
		List<BankRates> rates = new ArrayList<BankRates>();
		rates.add(rate01);
		return rates;
	}
	 
	 public void createRate(){
		 Rate rate = new Rate("CDI", 2016, 12, 1.23);
	
		 ratesRepository.save(rate);
	 }

}
