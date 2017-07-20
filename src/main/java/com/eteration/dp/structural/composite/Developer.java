package com.eteration.dp.structural.composite;

public class Developer implements Employee {// Leaf

	private String name;
	private double salary;

	public Developer(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}

	public void add(Employee employee) {
		throw new UnsupportedOperationException("this is leaf node so this method is not applicable to this class.");
	}

	public Employee getChild(int i) {
		// this is leaf node so this method is not applicable to this class.
		return null;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public void print() {
		System.out.println("-------------");
		System.out.println("Name =" + getName());
		System.out.println("Salary =" + getSalary());
		System.out.println("-------------");
	}

	public void remove(Employee employee) {
		throw new UnsupportedOperationException("this is leaf node so this method is not applicable to this class.");
	}

}