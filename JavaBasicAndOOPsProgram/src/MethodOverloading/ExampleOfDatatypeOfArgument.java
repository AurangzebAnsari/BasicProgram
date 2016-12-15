package MethodOverloading;

public class ExampleOfDatatypeOfArgument {
	
	void sum(int a,int b)
	{
		System.out.println("Sum of two number="+(a+b));
	}
	void sum(double a,double b)
	{
		System.out.println("Sum of three number="+(a+b));
	}
	void sum(long a,long b)
	{
		System.out.println("Sum of All number="+(a+b));
	}
	public static void main(String args[])
	{
		ExampleOfDatatypeOfArgument argument=new ExampleOfDatatypeOfArgument();
		argument.sum(120,300);
		argument.sum(200.00,34.55);
		argument.sum(200.9, 123.9);
	}


}
