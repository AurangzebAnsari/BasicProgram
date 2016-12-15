package MethodOverloading;

public class ReturnTypeMethodOverloading {
	int sum(int a,int b)
	{
		System.out.println("Sum of two number="+(a+b));
	}
	double sum(double a,double b)
	{
		System.out.println("Sum of Double Valude="+(a+b));
	}
	public static void main(String args[])
	{
		ReturnTypeMethodOverloading return1=new ReturnTypeMethodOverloading();
		return1.sum(20, 40);
		return1.sum(12.30, 23.43);
	}

}
