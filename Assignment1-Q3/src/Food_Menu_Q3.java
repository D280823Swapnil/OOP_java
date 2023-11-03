import java.util.Scanner;

public class Food_Menu_Q3 {
	 static void menu() {
			System.out.println("1. Dosa 20");
			System.out.println("2. Idli 25");
			System.out.println("3. Medu Vada 30");
			System.out.println("4. Poha 25");
			System.out.println("5. Pattice 15");
			System.out.println("6. Upma 25");
			System.out.println("7. Samosa 15");
			System.out.println("8. Wada pav 15");
			System.out.println("9. Wada Sambhar 25");
			System.out.println("10. Generate Bill ");
			System.out.print(" Enter Choice Code ");
			System.out.println();
		}
			

		public static void main(String[] args) {
			
			int choice = 0;
			double bill=0.0;
			Scanner sc = new Scanner(System.in);
			while(choice!=10) {
				menu();
			
				choice = sc.nextInt();
			
				switch(choice) {
				case 1:
					bill+=20;
					break;
				case 2:
					bill+=25;
					break;
				case 3:
					bill+=30;
					break;
				case 4:
					bill+=25;
					break;
				case 5:
					bill+=15;
					break;
				case 6:
					bill+=25;
					break;
				case 7:
					bill+=15;
					break;
				case 8:
					bill+=15;
					break;
				case 9:
					bill+=25;
					break;
				case 10:
					System.out.println("Total Bill Amount = "+bill);
					break;
				default:
					System.out.println("Entered Wrong Choice...");				
				}
			}
			sc.close();
		}

	
	
	

}
