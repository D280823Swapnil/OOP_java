
public class Star_Q4_2 {
	public static void main(String[] args) {
		int no = 5;
		int star_print = 1;
		
		// first half
		for(int i=0; i<no; i++) {
			// space 
			for(int j=0; j<no-i; j++) {
				System.out.print(" ");
			}
			// star
			for(int k=0; k<star_print; k++) {
				System.out.print("*");
			}
			star_print+=2;
			System.out.println();
		}
		
		star_print-= 4;
		
		//second half
		for(int i=no-1; i>0; i--) {
			// space 
			for(int k=0; k<=(no-i); k++) {
				System.out.print(" ");
			}
			// star
			for(int j=0; j<star_print; j++) {
				System.out.print("*");
			}
			star_print-=2;
			System.out.println();
		}

	}


}
