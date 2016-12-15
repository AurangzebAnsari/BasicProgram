package ExampleOfStaticKeyword.Counter;

public class ExampleOfCounterWithoutStatic {
	int a=0;
	static int ab=0;
	public ExampleOfCounterWithoutStatic() 
	{
		a++;
		System.out.println("A  "+a);
		ab++;
		System.out.println("B"+ab);
	}
}
