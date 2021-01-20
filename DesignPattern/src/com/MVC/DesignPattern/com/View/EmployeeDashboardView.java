package com.MVC.DesignPattern.com.View;

import com.MVC.DesignPattern.com.Model.Employee;

public class EmployeeDashboardView {
	public void printEmployeeInformation(Employee employee) {
		System.out.println("Name: " + employee.getFirstName() + " " + employee.getLastName());
		System.out.println("SSN: " + employee.getSSN());
		System.out.println("Salary: " + employee.getSalary());
		
	}

}
