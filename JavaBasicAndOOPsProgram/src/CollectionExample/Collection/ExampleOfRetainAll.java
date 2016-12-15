package CollectionExample.Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ExampleOfRetainAll {
	
	public static void main(String args[])
	{
		ArrayList<String> al=new ArrayList<>();
		al.add("Ravi kumar");
		al.add("Rehan Raza");
		al.add("Mukesh Kumar");
		al.add("Allu Kumar");
		al.add("Aminesh kumar");
		
		ArrayList<String> all=new ArrayList<String>();
		all.add("Ramesh kumar");
		all.add("Rehan Raza");
		all.add("shyam Kumar");
		all.add("Rehan Raza");
		all.add("Kumar");
		
		al.retainAll(all);
		System.out.println("Iterating the elements after removing the elements of all...");
	    
        Iterator t= al.iterator();
		
		while(t.hasNext())
		{
			System.out.println(t.next());
		}
	}

}
