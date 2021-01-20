package com.MVC.DesignPattern.com.Controller;

import com.MVC.DesignPattern.com.Model.Employee;
import com.MVC.DesignPattern.com.View.EmployeeDashboardView;

public class EmployeeController {
	private Employee employeeModel; //composition
	private EmployeeDashboardView view;
	
	public EmployeeController (Employee employeeModel, EmployeeDashboardView view) {
		this.employeeModel = employeeModel;
		this.view = view;
	}
	
	public void setEmployee(String firstName, String lastName) {
		employeeModel.setFirstName(firstName);
		employeeModel.setLastName(lastName);
		
	}
	public String getEmployee() {
		return employeeModel.getFirstName() + " " + employeeModel.getLastName();
		
	}
	
	public void setSSN(String SSN) {
		employeeModel.setSSN(SSN);
		
	}
	
	public String getSSN() {
		return employeeModel.getSSN();
	}
	
	public void setSalary(double salary) {
		employeeModel.setSalary(salary);
	}
	
	public double getSalary() {
		return employeeModel.getSalary();
	}
	
	//Update our View
	public void updateDashboardView() {
		view.printEmployeeInformation(employeeModel);
	}
}
