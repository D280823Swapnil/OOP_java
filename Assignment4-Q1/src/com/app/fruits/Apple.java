package com.app.fruits;

public class Apple extends Fruit {
	public Apple(){
		super();
	}
	
	public Apple(String name, String color, double weight, boolean isFresh) {
		super(name, color, weight, isFresh);
	}
	
	@Override
	public String toString() {
		return "Fruit : " + super.toString();
	}
	
	@Override
	public String taste() {
		return "sweet n sour";
	}
	
	@Override
	public void acceptDetails(Scanner sc) {
		this.name = "Apple";
		System.out.print("Enter Fruit Color ");
		this.color = sc.next();
		System.out.print("Enter Fruit Weight ");
		this.weight = sc.nextDouble();
		this.isFresh = true;
	}


}
