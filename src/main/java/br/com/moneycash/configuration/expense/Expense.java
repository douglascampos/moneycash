package br.com.moneycash.configuration.expense;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import br.com.moneycash.category.Category;

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
	
	@OneToOne(cascade = CascadeType.ALL)
	private Category category;
	
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
	
	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
	
	public String translateMethod(){
		if (this.method == 1) {
			return "Cartão de Débito";
		} else {
			return "Dinheiro";
		}
	}
	
//	public String getColor(){
//		return "background-color:"+ this.category.getColor();
//	}
	
	
}
