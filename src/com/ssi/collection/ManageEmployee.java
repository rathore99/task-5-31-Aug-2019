package com.ssi.collection;

import java.util.HashMap;

public class ManageEmployee {

	private HashMap<Employee, Project> employeeprojects;

	public ManageEmployee() {
		super();

		this.employeeprojects = new HashMap<Employee, Project>();
	}

	/*
	 * method to update records in hashmap inserts new emp record in array list
	 */
	public void assignProjects() {
		Project web = new Project(101, "web-Development", 20, "Mr. Singh");
		Project desktop = new Project(102, "Desktop App", 30, "Mr. Rathore");
		Project mobile = new Project(103,"Mobile-App",12,"Mr Tanish");
		
		Employee emp1 = new Employee(1001,"Vinod",20000,"Eng","Mobile dev");
		Employee emp2 = new Employee(1002,"Anuj",20000,"devloper","Web development");
		Employee emp3 = new Employee(1003,"rahul",2000,"Developer","Desktop app dev");
		Employee emp4 = new Employee(1004,"rahul r",2000,"Developer","Desktop app dev");
		Employee emp5 = new Employee(1003,"ramesh",2000,"tester","Desktop app dev	");
		employeeprojects.put(emp1, mobile);
		employeeprojects.put(emp2, web);
		employeeprojects.put(emp3, desktop);
		employeeprojects.put(emp4, desktop);
		employeeprojects.put(emp5, desktop);
		employeeprojects.put(emp5, web);
		employeeprojects.put(emp5, mobile);
		employeeprojects.put(emp1, mobile);

	}
	public void print(){
		employeeprojects.forEach((key,val)->System.out.println(key+": "+val));
		;
	}
	public static void main(String args[]){
		ManageEmployee mng = new ManageEmployee();
		mng.assignProjects();
		mng.print();
	}
	

}
