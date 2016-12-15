package MethodOverloading;

public class ExampleTypePromotion {
	void sum(int a,long b)
	{
		System.out.println("Sum="+(a+b));
	}
	void sum(int a,int b,double c)
	{
		System.out.println("Sum three No="+(a+b+c));
	}
	void sum( double a,long b)
	{
		System.out.println("Sum of two no="+(a+b));
	}
	public static void main(String args[])
	{
		ExampleTypePromotion promoted=new ExampleTypePromotion();
		promoted.sum(23, 34);
		promoted.sum(23, 54, 67);
		promoted.sum(23.5, 45);
	}
	

}
