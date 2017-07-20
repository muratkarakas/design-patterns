package com.eteration.dp.structural.composite;

public interface Employee {//Component
	   public void add(Employee employee);
	   public void remove(Employee employee);
	   public Employee getChild(int i);
	   public String getName();
	   public double getSalary();
	   public void print();
}
