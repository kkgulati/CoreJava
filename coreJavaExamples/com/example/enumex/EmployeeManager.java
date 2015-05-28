package com.example.enumex;

public class EmployeeManager {
	
	public static void main(String[] args) {
	
		//Emplopyee 1
		EmployeeService employeeService1=EmployeeService.getInstance();
		employeeService1.save();
		employeeService1.update();
		System.out.println(employeeService1);
		//Emplopyee 2
		EmployeeService employeeService2=EmployeeService.getInstance();
		employeeService2.save();
		employeeService2.update();
		System.out.println(employeeService2);
}

}
