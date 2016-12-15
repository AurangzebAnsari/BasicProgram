package CollectionExample.Collection;

import java.util.ArrayList;

public class ExampleOfForEachLoop {
	
	public static void main(String args[])
	{
		ArrayList<String> a=new ArrayList<>();
		   a.add("Rehan Raza");
		   a.add("Soham Kumar");
		   a.add("Ravi kumar");
		   a.add("Vikash Kumar");
		   a.add("Aurangzeb Ansari");
		   a.add("Vijay Roy");
		   a.add("Ram Kumar");
		   
		   for(String o:a)
		   {
			   System.out.println(o);
		   }
	}

}
