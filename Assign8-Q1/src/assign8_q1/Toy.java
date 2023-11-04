package assign8_q1;

import java.util.Scanner;

public class Toy extends Product {
	String ageGroup;
	String type;
	double vat_tax = 5;
	
	
	public Toy() {
		
	}
	
	public Toy(String title, double price,String ageGroup, String type) {
		super(title,price);
		this.ageGroup = ageGroup;
		this.type = type;
	}
	
	@Override
	public double getDiscountedPrice() {
		return this.getPrice() - this.getPrice()*(this.discount/100.0);
	}

	@Override
	public double getPrice() {
		double taxedPrice = this.price + this.price*(this.vat_tax/100.0);
		return taxedPrice;
	}
	
	@Override
	public String toString() {
		return "Toy: \n"+super.toString()+"\nAge Group : "+this.ageGroup+"\nType : "+this.type;
	}
	
	@Override
	public void accept(Scanner sc) {
		super.accept(sc);
		System.out.print("Enter Age Group ");
		this.ageGroup = sc.next();
		System.out.print("Enter Type ");
		this.type = sc.next();
;	}

}

