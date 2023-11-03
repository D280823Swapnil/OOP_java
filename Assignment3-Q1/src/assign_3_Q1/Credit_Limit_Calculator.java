package assign_3_Q1;

public class Credit_Limit_Calculator {
	public static void main(String[] args) {
		Customer c1 = new Customer(1,5000,25000,10000,50000);
		Customer c2 = new Customer(2,10000,20000,5000,20000);
		
		System.out.println("New Balance = "+ c1.newBalance());
		
		if(c1.isCreditAllowed()) {
			System.out.println("Credit allowed... New Balance = "+ c1.newBalance());
		}
		else {
			System.out.println("Credit limit exceeded");
		}
		
		System.out.println("New Balance = "+ c2.newBalance());
		
		if(c2.isCreditAllowed()) {
			System.out.println("Credit allowed... New Balance = "+ c2.newBalance());
		}
		else {
			System.out.println("Credit limit exceeded");
		}
	}
	

}
