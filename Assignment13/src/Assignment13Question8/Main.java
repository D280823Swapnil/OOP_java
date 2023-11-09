package Question8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main 
{
    public static Scanner sc=new Scanner(System.in);
    
    public static void main(String[] args) 
    {
	List<Emp> employees=new ArrayList();
	Emp e1=new Manager(125.12, 100);
	Emp e2=new Clerk(12.1);
	Emp e3=new Labor(80,50.5);
	Emp e4=new Manager(174.4, 50);
	Emp e5=new Clerk(87.3);
	Emp e6=new Labor(50,37.8);
	Emp e7=new Clerk(121);
	employees.add(e1);
	employees.add(e2);
	employees.add(e3);
	employees.add(e4);
	employees.add(e5);
	employees.add(e6);
	employees.add(e7);
	
	Iterator<Emp> itr=employees.iterator();
	while(itr.hasNext())
	{
	    Emp e=itr.next();
	    System.out.println(e);
	    System.out.println("--------------------------------");
	}
	
	System.out.println("**************************Total income: "+Emp.calcTotalIncome(employees.toArray(new Emp[employees.size()]))+"*******************************");
    }

}
