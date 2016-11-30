package ClassAndObject;

public class ExampleOfFactorialWithAnnonymousObject {
	void fact(int a)
	{
		int i;
		int fact=1;
		for(i=1;i<=a;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial number="+fact);
	}
	public static void main(String args[])
	{
		//calling Method fact() with Annonymous Object
		new ExampleOfFactorialWithAnnonymousObject().fact(6);
		
	}

}