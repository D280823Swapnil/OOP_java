package com.app.fruits;

import java.util.Scanner;

import com.app.fruits.EnumMenu.Menu;

public class FruitBasket {
	public static void main(String[] args) {
		Apple a = new Apple("Apple", "Maroon Red", 200, true);
		Orange o = new Orange("Orange", "Orange", 300, false);
		Mango m = new Mango("Mango", "Yellow", 450, true);
		
		System.out.println(a.toString());
		System.out.println(o.toString());
		System.out.println(m.toString());
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Basket Size ");
		int size = sc.nextInt();
		Fruit array[] = new Fruit[size];
		
		Menu menu = Menu.values()[1];
		int index =0;
		
		while(!menu.equals(Menu.values()[0])) {
			menu = Menu.values()[EnumMenu.options(sc)];
			switch(menu) {
				case Exit:
					break;
				case Add_Mango:
					if(index==size) {
						System.out.println("Basket Full.....");
						break;
					}	
					array[index] = new Mango();
					array[index].acceptDetails(sc);
					index++;
					break;
				case Add_Orange:
					if(index==size) {
						System.out.println("Basket Full.....");
						break;
					}
					array[index] = new Orange();
					array[index].acceptDetails(sc);
					index++;
					break;
				case Add_Apple:
					if(index==size) {
						System.out.println("Basket Full.....");
						break;
					}
					array[index] = new Apple();
					array[index].acceptDetails(sc);
					index++;
					break;
				case Display_Name_of_All_Fruits_in_the_Basket:
					for(int i=0; i<index; i++)
						System.out.println(array[i].getName()); 
					break;
				case Display_Details_of_All_Fruits_in_the_Basket:
					for(int i=0; i<index; i++)
						System.out.println(array[i].toString()); 
					break;
				case Display_Taste_of_All_Stale_Fruits_in_the_Basket:
					for(int i=0; i<index; i++) {
						if(!array[i].isFresh()) {
							System.out.println(array[i].taste());
						}
					}
					break;
				case Mark_a_Fruit_as_Stale:
					System.out.print("Enter the index of fruit you want to mark as stale ");
					int p = sc.nextInt();
					
					if(p>index) {
						System.out.println("Invalid Index Location ");
					}
					else {
						array[p].setFresh(false);
					}
					
					break;
				case Mark_All_Sour_Fruits_Stale:
					for(int i=0; i<index; i++) {
						if(array[i].taste().equals("sour")) {
							array[i].setFresh(false);
						}
					}
					break;
				default:
					System.out.println("Wrong Input.....");
					break;
			}
		}

	}



}
