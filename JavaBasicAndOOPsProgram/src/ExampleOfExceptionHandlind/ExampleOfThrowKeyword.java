package ExampleOfExceptionHandlind;

public class ExampleOfThrowKeyword {
	static void agevalue(int age)
	{
		if(age<18)
		{
			throw new ArithmeticException("This is not valid Person");
		}
		else
		{
			System.out.println("This is valid person");
		}
	}
	public static void main(String args[])
	{
		agevalue(12);
		System.out.println("Rehan Raza Here");
	}
}
