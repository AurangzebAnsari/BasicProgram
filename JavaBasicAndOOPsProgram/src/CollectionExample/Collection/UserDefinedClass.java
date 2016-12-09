package CollectionExample.Collection;

import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.Iterator;

class Collection
{
	int age,rollno;
	String name;
	
	Collection(int rollno,String name,int age)
	{
		this.rollno=rollno;
		this.name=name;
		this.age=age;
	}
}


public class UserDefinedClass {
	
	public static void main(String ags[])
	{
		Collection c1=new Collection(101,"Rehan Raza",20);
		Collection c2=new Collection(101,"sursj kumar",20);
		Collection c3=new Collection(101,"Rehan Raza",20);
		Collection c4=new Collection(101,"Rehan Raza",20);
		Collection c5=new Collection(101,"Rehan Raza",20);
		Collection c6=new Collection(101,"Rehan Raza",20);
		
		ArrayList<String> ai=new ArrayList<String>();
		
		c1.add(c1);
		
	}

}
