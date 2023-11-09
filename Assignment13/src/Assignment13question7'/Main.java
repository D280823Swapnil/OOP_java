package Question7;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
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
	Map<Integer,Student> map=new LinkedHashMap();
	Student stud1=new Student("abc", 1, 18);
	Student stud2=new Student("aasd", 2, 13);
	Student stud3=new Student("abasdc", 3, 21);
	Student stud4=new Student("asfbc", 4, 48);
	Student stud5=new Student("abrec", 5, 11);
	Student stud6=new Student("zcbc", 6, 41);
	map.put(1, stud1);
	map.put(2, stud2);
	map.put(3, stud3);
	map.put(4, stud4);
	map.put(5, stud5);
	map.put(6, stud6);
	
	System.out.println("Enter roll to search ");
	Integer roll=sc.nextInt();
	Student s=map.get(roll);
	System.out.println(s);
    }
}
