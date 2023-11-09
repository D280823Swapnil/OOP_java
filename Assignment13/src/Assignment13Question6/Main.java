package Question6;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main 
{
    private static Scanner sc=new Scanner(System.in);
    
    public static void main(String[] args) 
    {
	Map<String,Book> arrBook=new HashMap();
	Book b1=new Book("3",230,"Asdf",100);
	Book b2=new Book("2",150,"sdsd",100);
	Book b3=new Book("4",560,"Afc",100);
	Book b4=new Book("6",10,"qwebc",100);
	Book b5=new Book("1",100,"Abc",100);
	Book b6=new Book("5",210,"sdfc",100);
	Book b7=new Book("7",130,"qwc",100);
	arrBook.put("3", b1);
	arrBook.put("2", b2);
	arrBook.put("4", b3);
	arrBook.put("6", b4);
	arrBook.put("1", b5);
	arrBook.put("5", b6);
	arrBook.put("7", b7);
	
	System.out.println("Enter isbn to search ");
	String isbn = sc.next();
	Book f = arrBook.get(isbn);
	System.out.println(f);
	

    }
}