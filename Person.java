
//1.1) Create a class Person with properties (name and age) with following features.
//a) Default age of person should be 18,
//b) A person object can be initialized with name and age,
//c) Method to display name and age of person.

package com.demo.task.two;

public class Person {

	private String name;
	private int age;

	public Person(String name) {
		this.name = name;
		this.age = 18;
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void display() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;

	}
	public static void main(String[] args) {
		Person obj= new Person("Smaraki");
		obj.setName("Smaraki");
		System.out.println("Name:" + obj.name);
		System.out.println("Age: " + obj.age);
	}

}
