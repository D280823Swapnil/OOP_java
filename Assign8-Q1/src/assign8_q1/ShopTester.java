package assign8_q1;

import java.util.Scanner;

public class ShopTester {
	public static int options(Scanner sc) {
		System.out.println("-------------------------------");
		System.out.println("0 Exit");
		System.out.println("1 Buy Book");
		System.out.println("2 Buy Music Album");
		System.out.println("3 Buy Toy");
		System.out.println("4 Display Cart");
		System.out.println("5 Calculate Bill");
		System.out.println("-------------------------------");
		System.out.print("Enter Choice ");
		int ch = sc.nextInt();
		System.out.println("-------------------------------");
		return ch;
	}

	public static void main(String[] args) {
	
		
		Product[] products = new Product[5];
		
		Scanner sc = new Scanner(System.in);
		int choice =1;
		int index =0;
		
		System.out.println("Enter The Shop Discount");
		
		int discount= sc.nextInt();
		
		while(choice!=0) {
			choice = ShopTester.options(sc);
			switch(choice) {
				case 0:
					break;
				case 1:
					{
						if(index==5) {
							System.out.println("Cart Full.....");
							break;
						}
						products[index] = new Book();
						products[index].accept(sc);
						products[index].setDiscount(discount);
						index++;
					}
					break;
				case 2:
					{
						if(index==5) {
							System.out.println("Cart Full.....");
							break;
						}
						products[index] = new Album();
						products[index].accept(sc);
						products[index].setDiscount(discount);
						index++;
					}
					break;
				case 3:
					{
						if(index==5) {
							System.out.println("Cart Full.....");
							break;
						}
						products[index] = new Toy();
						products[index].accept(sc);
						products[index].setDiscount(discount);
						index++;
					}
					break;
				case 4:
					for(int i=0; i<index; i++) {
						System.out.println("-------------------------------");
						System.out.println( products[i].toString());
						System.out.println("-------------------------------");
					}
					break;
				case 5:
					{
						double bill=0;
						double revenue = 0;
						for(int i=0; i<index; i++) {
							bill+=products[i].getDiscountedPrice();
							revenue+= products[i].getPriceWithoutTAX();
							
						}
						System.out.println("-------------------------------");						
						System.out.println("Bill of Customer : "+bill);
						System.out.println("Revenue of Shop : "+revenue);
						System.out.println("-------------------------------");
					}
					break;
				default:
					System.out.println("Wrong Input Entered...");
					break;
				
			}
		}
		
		
	}

}

