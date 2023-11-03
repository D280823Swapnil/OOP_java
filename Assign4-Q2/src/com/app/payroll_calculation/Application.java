package com.app.payroll_calculation;

public class Application {

	public static void main(String[] args) {
		System.out.println("-----------------------------------------------------------------");
		Employee e1 = new Salaried_Employee("Sarvesh","Mungurwadi",541278964, 2000);
		
		System.out.println(e1.toString());
		
		System.out.println("-----------------------------------------------------------------");
		Employee e2 = new Hourly_Employee("Uday","Narkhede",3654712, 20,45);
		
		System.out.println(e2.toString());	
		
		System.out.println("-----------------------------------------------------------------");
		Employee e3 = new Commission_Employee("Prajwal","Khuse",4795127, 7,156);
		
		System.out.println(e3.toString());
		
		System.out.println("-----------------------------------------------------------------");		
		Employee e4 = new Base_Plus_Commission_Employee("Saurabh","Niley",97454712, 8,300,1500);
		
		System.out.println(e4.toString());

		// increase in 10% base salary;
		
		((Base_Plus_Commission_Employee) e4).setBaseSalary(((Base_Plus_Commission_Employee)e4).getBaseSalary()*1.1);
		
		System.out.println("-----------------------------------------------------------------");
		System.out.println(e4.toString());
		System.out.println("-----------------------------------------------------------------");
	}

}
