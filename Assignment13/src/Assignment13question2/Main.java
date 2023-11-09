package Question2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main 
{
    private static Scanner sc=new Scanner(System.in);
    
    public static void main(String[] args) 
    {
	Set<Book> arrBook=new HashSet();
	Collections.addAll(arrBook,
		new Book("1",100,"Abc",100),
		new Book("2",150,"sdsd",100),
		new Book("3",230,"Asdf",100),
		new Book("4",560,"Afc",100),
		new Book("5",210,"sdfc",100),
		new Book("6",10,"qwebc",100),
		new Book("7",130,"qwc",100)
		);
	arrBook.add(new Book("1",100,"Abc",100));
	
	Iterator<Book> itr=arrBook.iterator();
	while(itr.hasNext())
	{
	    Book b=itr.next();
	    System.out.println(b);
	    System.out.println("----------------------------------------------------");
	}
	

    }
}
