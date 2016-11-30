package MethodOverloading;

public class ExampleOfPromoted2 {
	void sum(int a,int b)
	{
		System.out.println("A Method is invoked");
		System.out.println(+a+""+b);
	}
	void sum(long a,long b)
	{
		System.out.println("B method is invoked");
	}
	void sum(double a,double b)
	{
		System.out.println("c method is invoked");
	}
	void sum(float a,float b)
	{
		System.out.println("D method is invoked");
	}
	public static void main(String args[])
	{
		ExampleOfPromoted2 e=new ExampleOfPromoted2();
		e.sum(22.9, 23.89);
		e.sum(22, 23);
		
	}

}
