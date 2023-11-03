package com.app.fruits;

public class EnumMenu {
	public enum Menu{
		Exit,
		Add_Mango,
		Add_Orange,
		Add_Apple,
		Display_Name_of_All_Fruits_in_the_Basket,
		Display_Details_of_All_Fruits_in_the_Basket,
		Display_Taste_of_All_Stale_Fruits_in_the_Basket,
		Mark_a_Fruit_as_Stale,
		Mark_All_Sour_Fruits_Stale
	}
	
	public static int options(Scanner sc) {
		System.out.println("---------------------------------------------------------");
		System.out.println("0. Exit");
		System.out.println("1. Add Mango");
		System.out.println("2. Add Orange");
		System.out.println("3. Add Apple");
		System.out.println("4. Display Name of All Fruits in the Basket");
		System.out.println("5. Display Details of All Fruits in the Basket");
		System.out.println("6. Display Taste of All Stale Fruits in the Basket");
		System.out.println("7. Mark a Fruit as Stale");
		System.out.println("8. Mark All Sour Fruits Stale");
		System.out.println("---------------------------------------------------------");
		System.out.print("Enter Choice ");
		int ch = sc.nextInt();
		System.out.println("---------------------------------------------------------");
		
		return ch;
		
	}

}
