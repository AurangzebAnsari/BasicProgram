package ClassAndObject;

public class ExampleOfObjectAndclass {
	//it is data mamber and also instance variable
		int rollno;
		String name;
		double marks; 
		void insertRecord(int r, String n,double m)
		{
			rollno=r;
			name=n;
			marks=m;
		}
		void display()
		{
			System.out.println("Roll number    "+rollno+"\nStudent'sName  "+name+"\nStudent's Marks Percent "+marks);
		}
		public static void main(String args[])
		{
			ExampleOfObjectAndclass example1=new ExampleOfObjectAndclass();
			example1.insertRecord(12,"Rehan Raza", 78.8);
			example1.display();
			
			ExampleOfObjectAndclass example2=new ExampleOfObjectAndclass();
			example2.insertRecord(13,"Suraj Kumar", 68.9);
			example2.display();
			
			
			
		}

}
