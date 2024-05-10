package com.abc.java8code.practice;

import java.util.Comparator;

public class Employee implements Comparator<Employee>{

	private int id;
	private double salary;
	private String name;

	public Employee(int id, double salary, String name) {
		super();
		this.id = id;
		this.salary = salary;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Emloyee [id=" + id + ", salary=" + salary + ", name=" + name + "]";
	}

	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.getSalary()>o2.getSalary()) {
			return +1;
		}else if(o1.getSalary()<o2.getSalary()) {
			return -1;
		}
		return 0;
	}

}
