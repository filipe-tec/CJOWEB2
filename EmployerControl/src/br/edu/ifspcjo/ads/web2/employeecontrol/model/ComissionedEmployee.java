package br.edu.ifspcjo.ads.web2.employeecontrol.model;

public class ComissionedEmployee extends Employee{
	
	protected double salesValue;
	protected double comissionPercentege;
	
	public ComissionedEmployee(String name, String cpf, double salesValue, double comissionPercentege) {
		super(name, cpf);
		this.salesValue = salesValue;
		this.comissionPercentege = comissionPercentege; 
	}

	public double getSalesValue() {
		return salesValue;
	}

	public void setSalesValue(double salesValue) {
		this.salesValue = salesValue;
	}

	public double getComissioPercentege() {
		return comissionPercentege;
	}

	public void setComissioPercentege(double comissionPercentege) {
		this.comissionPercentege = comissionPercentege;
	}

	@Override
	public double calculateIncome() {
		return salesValue * comissionPercentege/100;
	}
	
	@Override
	public String toString() {
		return "ComissionedEmployee [salesValue=" + salesValue + ", comissioPercentege=" + comissionPercentege
				+ ", name=" + name + ", cpf=" + cpf + "]";
	}
	
}
