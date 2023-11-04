package com.sunbeam;

public class Box<T> {
	private T obj;

	public Box(T obj) {
		this.obj = obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}

	public T getObj() {
		return this.obj;
	}

	public static void printDisplayableBox(Box<? extends Displayable> b) {
		b.getObj().display();
	}

	public static void printAnyBox(Box<?> b) {
		System.out.println(b.getObj().toString());
	}
}
