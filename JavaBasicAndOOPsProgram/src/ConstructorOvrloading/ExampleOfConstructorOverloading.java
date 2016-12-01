package ConstructorOvrloading;

public class ExampleOfConstructorOverloading {
	int id,roll,age,totalmarks;
	String name,college;
	double percentage;
	int sunject1,sunject2,sunject3,sunject4,sunject5;
	public ExampleOfConstructorOverloading(int i,int r ,int a) {
		id=i;
		roll=r;
		age=a;
		System.out.println("\nStudent's Id  "+id);
		System.out.println("\nStudent's Roll number  "+roll);
		System.out.println("\nStudent's Age  "+age);
		
	}
	public ExampleOfConstructorOverloading(String n,String c) {
		name=n;
		college=c;
		System.out.println("Student's Name  "+name);
		System.out.println("\nCollege Name "+college);
	}
	public ExampleOfConstructorOverloading(int s1,int s2,int s3,int s4,int s5) {
		sunject1=s1;
		sunject2=s2;
		sunject3=s3;
		sunject4=s4;
		sunject5=s5;
		totalmarks=s1+s2+s3+s4+s5;
	    percentage=totalmarks*100/500;
		System.out.println("\nStudent's Total Marks  "+totalmarks);
		
		System.out.println("\nStudent's Percentage  "+percentage);
		
		if(percentage>=60)
		{
			System.out.println("\nFirst Division");
		}
		else if(percentage>=50)
		{
			System.out.println("\nSecond Division");
		}
	     else if(percentage>=40)
		{
			System.out.println("\nThird Division");
		}
	     else
	     {
	    	 System.out.println("\nFail");
	     }
		
	}
	

}
