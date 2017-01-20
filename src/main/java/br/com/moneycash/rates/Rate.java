package br.com.moneycash.rates;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "rates")
public class Rate 	{

	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name = "name", nullable = false, length = 50)
	private String name;
	
	@Column(name = "month", nullable = false)
	private Integer month;
	
	@Column(name = "year", nullable = false)
	private Integer year;
	
	@Column(name = "tx", nullable = false)
	private double tx;
	
	public Rate() {
	}
	
	public Rate(String name, Integer year, Integer month, double tx) {
		this.year = year;
		this.month = month;
		this.tx = tx;
		this.name = name;
		
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getMonth() {
		return month;
	}
	public void setMonth(Integer month) {
		this.month = month;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	public double getTx() {
		return tx;
	}
	public void setTx(double tx) {
		this.tx = tx;
	}
}
