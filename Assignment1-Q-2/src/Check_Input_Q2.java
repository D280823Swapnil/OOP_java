import java.util.Scanner;

public class Check_Input_Q2 {
	public static void main(String[] args) {
		double d1,d2;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st Number ");
		if(sc.hasNextDouble() && !sc.hasNextInt()) {
			d1 = sc.nextDouble();
		}
		else {
			System.out.println("Invalid Input...Please Enter appropriate double values");
			sc.close();
			return;
		}
		
		System.out.print("Enter 2nd Number ");
		if(sc.hasNextDouble() && !sc.hasNextInt()) {
			d2 = sc.nextDouble();
		}
		else {
			System.out.println("Invalid Input...Please Enter appropriate double values");
			sc.close();
			return;
		}
		
		double avg = (d1+d2)/2.0;		
		System.out.println("Average is " + avg);
		
		
		sc.close();

	}


}
