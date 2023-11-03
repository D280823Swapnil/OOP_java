package assign_2_Q2;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee e1 = new Employee("Manoj","Hare",50000);
		Employee e2 = new Employee("Saurabh","Niley",70000);
		
		//
		System.out.println("First Name = "+ e1.getFirstName());
		System.out.println("Last Name = "+ e1.getLastName());
		System.out.println("Salary = "+ e1.getSalary());
		
		System.out.println("First Name = "+ e2.getFirstName());
		System.out.println("Last Name = "+ e2.getLastName());
		System.out.println("Salary = "+ e2.getSalary());
		
		// 10% raise
		
		e1.setSalary(e1.getSalary()*1.1);
		e2.setSalary(e2.getSalary()*1.1);
		
		System.out.println("First Name = "+ e1.getFirstName());
		System.out.println("Last Name = "+ e1.getLastName());
		System.out.println("Salary = "+ e1.getSalary());
		
		System.out.println("First Name = "+ e2.getFirstName());
		System.out.println("Last Name = "+ e2.getLastName());
		System.out.println("Salary = "+ e2.getSalary());
		
		// set sal to zero...
		
		e1.setSalary(-7600);
		System.out.println("First Name = "+ e1.getFirstName());
		System.out.println("Last Name = "+ e1.getLastName());
		System.out.println("Salary = "+ e1.getSalary());

	}



}
