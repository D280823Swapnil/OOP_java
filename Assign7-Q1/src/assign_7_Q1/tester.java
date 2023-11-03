package assign_7_Q1;

import java.util.Scanner;

public class tester {

	public static int choice(Scanner sc) {
		System.out.println("0.Exit");
		System.out.println("1.Circle");
		System.out.println("2.Square");
		System.out.println("3.Triangle");
		System.out.println("4.Rectangle");
		System.out.println("5.Display all shapes");
		System.out.println("Enter Choice Code");
		int ch = sc.nextInt();
		System.out.println();
		return ch;
	}
	
	public static void main(String[] args) {
		
		BoundedShape Shapes[] = new BoundedShape [5];
				
		Scanner sc = new Scanner(System.in);
		int choice = 1;
		int index = 0;
		
		while(choice!=0) {
			choice = tester.choice(sc);
		switch (choice){
		
		case 0:
			System.out.println("EXIT");
			break;
			
		case 1:
			System.out.println("Enter the Radius : ");
			double Radius = sc.nextDouble();
			Shapes[index] = new Circle(Radius); 
			System.out.println("Area of Circle : "+Shapes[index].calcArea());
			index++;
			break;
			
		case 2:
			System.out.println("Enter the Side : ");
			double side = sc.nextDouble();
			Shapes[index]=new Square(side);
			System.out.println("Area of Square : "+Shapes[index].calcArea());
			index++;
			break;
			
		case 3:
			System.out.println("Enter the Side1 : ");
			System.out.println("Enter the Side2 : ");
			System.out.println("Enter the Side3 : ");
			double side1 = sc.nextDouble();
			double side2 = sc.nextDouble();
			double side3 = sc.nextDouble();
			Shapes[index]= new Triangle(side1 , side2 , side3);
			System.out.println("Area of Triangle : "+Shapes[index].calcArea());
			index++;
			break;
			
		case 4:
			System.out.println("Enter the Length : ");
			System.out.println("Enter the Breadth : ");
			double length = sc.nextDouble();
			double breadth = sc.nextDouble();
			Shapes[index]=new Rectangle(length , breadth);
			System.out.println("Area of Rectangle : "+Shapes[index].calcArea());
			index++;
			break;
			
		case 5:
			for (int i=0; i<index ; i++)
				System.out.println("Area : " +Shapes[i].calcArea());
			break;
			
		default:
			System.out.println("Incorrect Choice");
			break;	
			
			}
		}
	}
}