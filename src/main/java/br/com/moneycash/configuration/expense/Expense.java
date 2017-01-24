package br.com.moneycash.configuration.expense;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "expenses")
public class Expense {

	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name="description")
	private String description;
	
	@Column(name="value")
	private double value;
	
	@Column(name="type")
	private Integer method;
	
	public Expense(){		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public Integer getType() {
		return method;
	}

	public void setType(Integer type) {
		this.method = type;
	}
	
	public String translateMethod(){
		if (this.method == 1) {
			return "Cartão de Débito";
		} else {
			return "Dinheiro";
		}
	}
	
	
}
