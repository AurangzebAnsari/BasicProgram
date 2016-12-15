package MethodOverloading;


public class ExampleOfAmbiguty {
	void sum(int a,long b)
	{
		System.out.println("A method invoked");
	}
	void sum(long a,int b)
	{
		System.out.println("B method invoked");
	}
	void Sum(double a,float b)
	{
		System.out.println("C method Invoked");
	}
	void sum(float a,double b)
	{
		System.out.println("D method invoked");
	}
	public static void main(String arfd[])
	{
		ExampleOfAmbiguty exam=new ExampleOfAmbiguty();
		exam.sum(12, 23);
		exam.sum(12, 32);
	}

}
