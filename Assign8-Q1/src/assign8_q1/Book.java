package assign8_q1;

import java.util.Scanner;

public class Book extends Product {
	int isbn;
	String author;
	String subject;
	
	{
		this.discount=0;
	}
	
	public Book() {
		super();
	}

	public Book(String title, double price, int isbn, String author, String subject) {
		super(title,price);
		
		this.isbn = isbn;
		this.author = author;
		this.subject = subject;
	}
	
	@Override
	public double getPrice() {
		return this.price;
	}
	
	@Override
	public double getDiscountedPrice() {
		double dp =  this.price- this.price*(this.discount/100);  
		return dp;
	}
	
	
	@Override
	public void accept(Scanner sc) {
		super.accept(sc);
		System.out.print("Enter ISBN : ");
		this.isbn = sc.nextInt();
		System.out.print("Enter Author : ");
		this.author = sc.next();
		System.out.print("Enter Subject : ");
		this.subject = sc.next();	
	}
	
	@Override
	public String toString() {
		return "Book: \n"+super.toString()+ "\nISBN : "+this.isbn+ "\nAuthor : "+ this.author+ "\nSubject : "+ this.subject;
	}
	

}
