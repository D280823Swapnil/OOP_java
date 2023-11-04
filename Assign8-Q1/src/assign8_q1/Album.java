package assign8_q1;
import java.util.Scanner;

public class Album extends Product{
	String singer;
	String musician;
	private double gst = 10;
	
	public Album() {
		super();
	}
	
	public Album(String title, double price,String singer, String musician) {
		super(title,price);
		this.singer = singer;
		this.musician = musician;
	}
	
	@Override
	public double getDiscountedPrice() {
		
		return this.getPrice() - (this.getPrice()*(this.discount/100)) ;
	}
	
	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		// gst 10%
		return (this.price*(this.gst/100)) + this.price;
	}
	
	@Override
	public void accept(Scanner sc) {
		super.accept(sc);
		System.out.print("Enter Singer : ");
		this.singer = sc.next();
		System.out.print("Enter Musician : ");
		this.musician = sc.next();
	
	}
	
	@Override
	public String toString() {
		return "Music Album: \n"+super.toString()+"\nSinger : "+ this.singer+ "\nMusician : "+this.musician;
	}
	
}
