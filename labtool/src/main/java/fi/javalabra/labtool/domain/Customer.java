package fi.javalabra.labtool.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Table(name = "customers")
@Entity
public class Customer {

	@Id
	@GeneratedValue
	private Long id;

	@Column
	private String firstName;

	@Column
	private String lastName;

	protected Customer() {
	}

	public Customer(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return String.format("Customer[firstName='%s', lastName='%s']",
				firstName, lastName);
	}

}
