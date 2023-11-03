
public class Star_Q4_1 {

	public static void main(String[] args) {
		int n = 5;
		
		for(int i=0; i<n; i++) {
			// spaces 
			for(int j=0; j<n-i; j++) {
				System.out.print(" ");
			}
			// star
			for(int k=0; k<=i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
