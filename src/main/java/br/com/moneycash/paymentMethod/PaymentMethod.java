package br.com.moneycash.paymentMethod;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "payment_methods")
public class PaymentMethod {

	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name="name", nullable = false, length = 50)
	private String name;
	
	@Column(name="description", nullable = false, length = 50)
	private String description;

	public PaymentMethod(){
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
