package com.ssi.collection;

//import java.util.ArrayList;

public class Employee {
	private int employeeNo;
	private String employeeName;
	private double salary;
	private String designation;
	private String departmentName;

	public Employee(int employeeNo, String employeeName, double salary, String designation, String departmentName
			) {
		super();
		this.employeeNo = employeeNo;
		this.employeeName = employeeName;
		this.salary = salary;
		this.designation = designation;
		this.departmentName = departmentName;
		
	}

	

	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + employeeNo;
		return result;
	}






	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (employeeNo != other.employeeNo)
			return false;
		return true;
	}






	@Override
	public String toString() {
		return "[empNo=" + employeeNo + ", empName=" + employeeName + ", salary=" + salary
				+ ", designation=" + designation + ", departmentName=" + departmentName + "]";
	}

	public int getEmployeeNo() {
		return employeeNo;
	}

	public void setEmployeeNo(int employeeNo) {
		this.employeeNo = employeeNo;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	/*----------getter and setter------------------*/

}
