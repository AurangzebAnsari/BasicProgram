package CollectionExample.Collection;

import java.util.*;

public class CollectionFirstProgram {
	
	public static void main(String args[])
	{
		ArrayList<String> array=new ArrayList<String>();
		   array.add("Rehan Raza");
		   array.add("Soham Kumar");
		   array.add("Ravi kumar");
		   array.add("Vikash Kumar");
		   array.add("Aurangzeb Ansari");
		   array.add("Vijay Roy");
		   array.add("Ram Kumar");
		   
		   Iterator t=array.iterator();
		   
		   while(t.hasNext())
		   {
			   System.out.println(t.next());
		   }
	}

}
