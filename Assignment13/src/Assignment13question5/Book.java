package Question5;

import java.util.Objects;
import java.util.Scanner;

public class Book implements Comparable<Book>
{
    public Scanner sc=new Scanner(System.in);
    private String isbn;
    private double price;
    private String authorName;
    private int quantity;
    
    public Book(String isbn, double price, String authorName, int quantity) {
	super();
	this.isbn = isbn;
	this.price = price;
	this.authorName = authorName;
	this.quantity = quantity;
    }

    public Book() {
	super();
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

//    @Override
//    public String toString() {
//	StringBuilder sb=new StringBuilder();
//	return sb.append("ISBN: ")
//		.append(isbn)
//		.append("\nPrice: ")
//		.append(price)
//		.append("\nAuthor name: ")
//		.append(authorName)
//		.append("\nQuantity: ")
//		.append(quantity)
//		.toString();
//    }
    
    
    
    public void accept()
    {
	System.out.println("Enter ISBN: ");
	setIsbn(sc.next());
	System.out.println("Enter price: ");
	setPrice(sc.nextDouble());
	System.out.println("Enter author name: ");
	setAuthorName(sc.next());
	System.out.println("Enter quantity: ");
	setQuantity(sc.nextInt());
    }

    @Override
    public boolean equals(Object obj) {
	if(obj==null) return false;
	if(this==obj) return true;
	if(obj!=null)
	{
	    Book book=(Book) obj;
	    if(this.getIsbn().equals(book.getIsbn())) return true;
	}
	return false;
    }

    @Override
    public String toString() {
	return "isbn=" + isbn + ", price=" + price + ", authorName=" + authorName + ", quantity=" + quantity;
    }

    @Override
    public int hashCode() {
	return Objects.hash(isbn);
    }
    
    @Override
    public int compareTo(Book arg0) {
	return Double.compare(this.price,arg0.price);
    }
}
