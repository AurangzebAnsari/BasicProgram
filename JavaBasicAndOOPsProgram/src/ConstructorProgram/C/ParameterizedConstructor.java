package ConstructorProgram.C;

public class ParameterizedConstructor {
	int rollno,id,totalmarks;
	String name,fname;
	public ParameterizedConstructor(int r,int i,int t,String n,String f) {
		try
		{
			 rollno=r;
		     id=i;
		     totalmarks=t;
		     name=n;
			 fname=f;
			System.out.println("Student Name  "+name+"\nFather's Name   "+fname);
		    System.out.println("Student's Roll nummber  "+rollno+"\nStudent's Id  "+id+"\nStudent's Total Marks  "+totalmarks);
		}
		catch(Exception e)
		{
		System.out.println(e);
		}
	
	}

}
