package com.miscellaneous.sdp.composite.caseb;

//Component Class
public abstract class Employee {

	protected String name;
	protected int empId;
	protected long salary;
	
	public abstract void add(Employee employee);
	
	public abstract void remove(Employee employee);
	
	public Employee(String name, int empId, long salary) {
		super();
		this.name = name;
		this.empId = empId;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}

	public int getEmpId() {
		return empId;
	}

	public long getSalary() {
		return salary;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", empId=" + empId + ", salary=" + salary + "]";
	}
	
}
