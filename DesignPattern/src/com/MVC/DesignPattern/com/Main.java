package com.MVC.DesignPattern.com;

import com.MVC.DesignPattern.com.Controller.EmployeeController;
import com.MVC.DesignPattern.com.Model.Employee;
import com.MVC.DesignPattern.com.View.EmployeeDashboardView;

public class Main {

	public static void main(String[] args) {
		
		Employee employee = retrieveEmployeeFromServer();
		
		//Create our view to which we will write our employee information into
		EmployeeDashboardView view = new EmployeeDashboardView();
		
		//Create our controller
		EmployeeController controller = new EmployeeController(employee, view);
		
		controller.updateDashboardView();

	}
	
	public static Employee retrieveEmployeeFromServer() {
		Employee employee = new Employee();
		employee.setSSN("123456789");
		employee.setFirstName("Terence");
		employee.setLastName("Ateya");
		employee.setSalary(125000);
		
		return employee;
	}

}
