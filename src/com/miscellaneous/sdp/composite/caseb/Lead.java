package com.miscellaneous.sdp.composite.caseb;

import java.util.ArrayList;
import java.util.List;

//Composite Class
public class Lead extends Employee {
	
	private List<Employee> employeeList = new ArrayList<>();

	public Lead(String name, int empId, long salary) {
		super(name, empId, salary);
	}
	
	@Override
	public void add(Employee employee) {
		employeeList.add(employee);
	}
	
	@Override
	public void remove(Employee employee) {
		employeeList.remove(employee);
	}
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder("Dev-Lead :: ");
		sb.append(name).append(" ")
		.append(empId).append(" ")
		.append(salary).append("\n");
		
		employeeList.stream().forEach(e -> {
			sb.append("\t").append(e.toString());
		});
		
		return sb.toString();
	}

}
