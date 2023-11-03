
public class Star_Q4_3 {
	public static void main(String[] args) {
		int no=6;
		
		for(int i=0; i<no; i++) {
			// space 
			for(int j=0; j<no-i; j++) {
				System.out.print(" ");
			}
			//star
			for(int k=0; k<=i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}


}
