package com.miscellaneous.sdp.composite.caseb;

//Leaf Class
public class Developer extends Employee {

	public Developer(String name, int empId, long salary) {
		super(name, empId, salary);
	}
	
	@Override
	public void add(Employee employee) {
		throw new UnsupportedOperationException("Cannot add reportee to Developer");
	}
	
	@Override
	public void remove(Employee employee) {
		throw new UnsupportedOperationException("Cannot remove reportee from Developer");
	}

	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append("Developer :: ")
		.append(name).append(" ")
		.append(empId).append(" ")
		.append(salary).append("\n");
		
		return sb.toString();
	}
	
}
