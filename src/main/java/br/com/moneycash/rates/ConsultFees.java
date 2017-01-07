package br.com.moneycash.rates;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class ConsultFees<T> {
	
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

}
