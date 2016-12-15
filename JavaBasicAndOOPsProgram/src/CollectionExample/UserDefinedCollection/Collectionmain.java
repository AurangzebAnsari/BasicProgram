package CollectionExample.UserDefinedCollection;

import java.util.ArrayList;
import java.util.Iterator;

public class Collectionmain {
	
	public static void main(String args[])
	{
		UserDefinedClass u=new UserDefinedClass(101, "Aurangzeb Ansari", 20);
		UserDefinedClass u1=new UserDefinedClass(102, "Guddu Ansari", 21);
		UserDefinedClass u2=new UserDefinedClass(103, "Sameer khan", 23);
		UserDefinedClass u3=new UserDefinedClass(104, "Irshad Ansari", 23);
		UserDefinedClass u4=new UserDefinedClass(105, "Sonam Kumari", 19);
		
		
		ArrayList<String> a=new ArrayList<String>();
		//a.add("Rehan Raza");
		//a.add("Vikash Kumar");
	     a.add(u);
	    a.add(u1);
	    a.add(u2);
	    a.add(u3);
	    a.add(u4);
	    
	    Iterator t=a.iterator();
	    
	    while(t.hasNext())
	    {
	    	UserDefinedClass st=(UserDefinedClass)t.next();
	    	System.out.println("Name "+st.name+"\nRoll Number"+st.rollno+"\nAge "+st.age);
	    }
		
	}

}
