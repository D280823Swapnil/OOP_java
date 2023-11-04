package com.sunbeam;

public class Box<T extends Employee> {
	T obj;

	public Box(T obj) {
		this.obj = obj;
	}

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}

	public static <E extends Employee> void printSalary(E obj) {
		System.out.println("Total salary = " + obj.calcSalary() + " Class = " + obj.getClass().getSimpleName());
	}

}
