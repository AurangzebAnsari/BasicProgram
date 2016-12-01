package ExampleOfStaticKeyword;

public class ExapleOfStaticvariable {
	int roll,totalmarks,subject1,subject2,subject3,subject4,subject5;
	static String course="BCA",College="CIMAGE COLLEGE",sesion="2013-2016";
	String name;
	 ExapleOfStaticvariable(String n,int r) {
		 name=n;
		 roll=r;
	}
	 void result(int s1,int s2,int s3,int s4,int s5)
	 {
		 subject1=s1;
		 subject2=s2;
		 subject3=s3;
		 subject4=s4;
		 subject5=s5;
		 totalmarks=subject1+subject2+subject3+subject4+subject5;
		 
		 double percent=totalmarks*100/500;
		 
		 System.out.println("Total Marks  "+totalmarks);
		 
		 System.out.println("Total Percentage  "+percent);
		 
		 if(percent>=60)
			{
				System.out.println("First Division\n");
			}
			else if(percent>=50)
			{
				System.out.println("Second Division\n");
			}
		     else if(percent>=40)
			{
				System.out.println("Third Division\n");
			}
		     else
		     {
		    	 System.out.println("Fail\n");
		     }
	 }
   
	 void display()
	 {
		 System.out.println("Student's Name  "+name+"\nStudent's Roll no   "+roll);
		 System.out.println("Collage Name   "+College+"\nCourse   "+course+"\nSesion  "+sesion);
	 }
}
