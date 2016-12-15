package MethodOverloading;

public class ExampleOfMethodOverloading {
	void sum(int a,int b)
	{
		System.out.println("Sum of two number="+(a+b));
	}
	void sum(int a,int b,int c)
	{
		System.out.println("Sum of three number="+(a+b+c));
	}
	void sum(int a,int b,int c,int d)
	{
		System.out.println("Sum of All number="+(a+b+c+d));
	}
	public static void main(String args[])
	{
		ExampleOfMethodOverloading m=new ExampleOfMethodOverloading();
		m.sum(120,300);
		m.sum(200, 12, 34);
		m.sum(200, 123, 342, 121);
	}

}
