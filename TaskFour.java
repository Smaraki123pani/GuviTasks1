
//1.4)Define a base class person with attributes name and age.
//Create a subclass Employee that inherits from Person and adds attributes like employeeID and salary.
//Use the super keyword to initialize the Person attributes in the Employee constructor

package com.demo.task.two;

class PersonBase {
	String name;
	int age;

	public PersonBase(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void displayDetails() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}
}

class Employee extends PersonBase {
	int employeeID;
	double salary;

	public Employee(String name, int age, int employeeID, double salary) {
		super(name, age);
		this.employeeID = employeeID;
		this.salary = salary;
	}

	public void displayDetails() {
		super.displayDetails();
		System.out.println("Employee ID: " + employeeID);
		System.out.println("Salary: " + salary);
	}
}

public class TaskFour {
	public static void main(String[] args) {

		Employee employee = new Employee("Smaraki", 25, 1234, 50000);

		employee.displayDetails();
	}
}
