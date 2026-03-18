package br.edu.ifspcjo.ads.web2.employeecontrol.model;

public class Employee {
	
	protected String name;
	protected String cpf;
	
	public Employee(String name, String cpf) {
		super();
		this.name = name;
		this.cpf = cpf;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public double calculateIncome() {
		return 0;
	}
	
	
}
