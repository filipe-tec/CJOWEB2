package br.edu.ifspcjo.ads.web2.employeecontrol.model;

public class HourEmployee extends Employee{
	
	private int numberOfHoursWorked;
	private double valueOfHoursWorked;
	
	public HourEmployee(String name, String cpf, int numberOfHoursWorked, double valueOfHoursWorked) {
		super(name, cpf);
		this.numberOfHoursWorked = numberOfHoursWorked;
		this.valueOfHoursWorked = valueOfHoursWorked; 
		
	}

	public int getNumberOfHoursWorked() {
		return numberOfHoursWorked;
	}

	public void setNumberOfHoursWorked(int numberOfHoursWorked) {
		this.numberOfHoursWorked = numberOfHoursWorked;
	}

	public double getValueOfHoursWorked() {
		return valueOfHoursWorked;
	}

	public void setValueOfHoursWorked(double valueOfHoursWorked) {
		this.valueOfHoursWorked = valueOfHoursWorked;
	}
	
	@Override
	public double calculateIncome() {
		return numberOfHoursWorked * valueOfHoursWorked;
	}
	
	@Override
	public String toString() {
		return "HourEmployee [numberOfHoursWorked=" + numberOfHoursWorked + ", valueOfHoursWorked=" + valueOfHoursWorked
				+ ", name=" + name + ", cpf=" + cpf + "]";
	}
}
