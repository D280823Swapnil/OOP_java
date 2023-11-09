package Assignment13Question1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

/*
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
*/
public class main 
{
    public static void Assignment13Question1(String[] args) 
    {
	Collection<String> c = new ArrayList<>();
    Collection<String> d = new HashSet<>();
	Collection<String> e = new LinkedHashSet<>();
	Collection<String> f = new TreeSet<>();
	c.add("B");
	c.add("D");
	c.add("A");	
	c.add("C");
	// c.add(null);
	// c.add(null);
	// c.add(null);
	System.out.println(c.toString());
    }
}


