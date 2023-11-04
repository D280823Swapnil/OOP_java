package assign8_q1;

import java.util.Scanner;

public abstract class Product {
	String title;
	double price;
	double discount;
	
	public Product() {
		super();
	}
	
	public Product(String title, double price) {
		super();
		this.title = title;
		this.price = price;
		this.discount = 0;
	}
		
	public double getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}
	
	abstract public double getDiscountedPrice();
	abstract public double getPrice();
	
	public double getPriceWithoutTAX() {
		return this.price - this.price*(this.discount/100.0);
	}
	
	public void accept(Scanner sc) {
		System.out.print("Enter Title : ");
		this.title = sc.next();
		System.out.print("Enter Price : ");
		this.price = sc.nextDouble();
	}

	@Override
	public String toString() {
		return "Title : "+ this.title + "\nPrice : "+this.price+ "\nTaxedPrice : "+this.getPrice()+ "\nDiscounted Price : "+this.getDiscountedPrice();
	}	
	
}
