package com.example.enumex;

public class EmployeeService {
	
	//private static EmployeeService employeeService=null;
	private static EmployeeService employeeService=new EmployeeService("P");
		
	String type;
	
	private EmployeeService(String type) {
		this.type = type;
	}
	
	public void save(){
		System.out.println("Employee of "+this.type+" type Saved!");
	}

	public void update(){
		System.out.println("Employee of "+this.type+" type Updated!");
	}
	
	/*
	static{
		employeeService = new EmployeeService("P");
	}*/
	
	public synchronized static EmployeeService getInstance(){
		return employeeService;
	}
	
	/*
	public synchronized static EmployeeService getInstance(){
		if(employeeService == null){
			employeeService = new EmployeeService("P");
		}
		return employeeService;
	}
	*/
	
}
