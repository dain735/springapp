package es.unileon.springapp.domain;

import java.io.Serializable;

public class Client implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String dni;
	private String name;
	private String accountNumber;
	public Insurance insurance;
	
	
	public Insurance getInsurance() {
		return insurance;
	}

	public void setInsurance(Insurance insurance) {
		this.insurance = insurance;
	}

	public String getDni() {
		return dni;
	}
	
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	@Override
	public String toString() {
		return "Client [dni=" + dni + ", name=" + name + ", accountNumber="
				+ accountNumber + "]";
	}
}
