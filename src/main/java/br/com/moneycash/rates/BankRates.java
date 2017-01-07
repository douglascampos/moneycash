package br.com.moneycash.rates;

public class BankRates {
	
	private Integer position;
	private String name;
	private double monthlyInterest;
	private double annualInterest;
		
	public Integer getPosition() {
		return position;
	}
	public void setPosition(Integer position) {
		this.position = position;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMonthlyInterest() {
		return monthlyInterest;
	}
	public void setMonthlyInterest(double monthlyInterest) {
		this.monthlyInterest = monthlyInterest;
	}
	public double getAnnualInterest() {
		return annualInterest;
	}
	public void setAnnualInterest(double annualInterest) {
		this.annualInterest = annualInterest;
	}
	
	@Override
	public String toString() {
		return "BankRates [position=" + position + ", name=" + name + ", monthlyInterest=" + monthlyInterest
				+ ", annualInterest=" + annualInterest + "]";
	}

}
