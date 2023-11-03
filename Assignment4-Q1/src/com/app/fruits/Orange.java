package com.app.fruits;

public class Orange extends Fruit {
	public Orange() {
		
	}
	
	public Orange(String name, String color, double weight, boolean isFresh) {
		super(name, color, weight,isFresh);
	}
	
	
	@Override
	public String toString() {
		
		return "Fruit : "+super.toString();
	}
	
	@Override
	public String taste() {
		return "sour";
	}
	
	@Override
	public void acceptDetails(Scanner sc) {
		this.name = "Orange";
		System.out.print("Enter Fruit Color ");
		this.color = sc.next();
		System.out.print("Enter Fruit Weight ");
		this.weight = sc.nextDouble();
		this.isFresh = true;
	}


}
