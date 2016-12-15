package CollectionExample.Collection;

import java.util.*;


public class ExampleAddAll {
	public static void main(String args[])
	{
		ArrayList<String> al=new ArrayList<>();
		al.add("Ravi kumar");
		al.add("Rehan Raza");
		al.add("Mukesh Kumar");
		al.add("Allu Kumar");
		al.add("Aminesh kumar");
		al.add("Arjun kumar");
		al.add("Kumar");
		al.add("Samitab");
		
		
		ArrayList<String> all=new ArrayList<String>();
		all.add("Ramesh kumar");
		all.add("Rehan Raza");
		all.add("shyam Kumar");
		
		al.addAll(all);
		Iterator t= al.iterator();
		while(t.hasNext())
		{
			System.out.println(t.next());
		}
		
	}

}
