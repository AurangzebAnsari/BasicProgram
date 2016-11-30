package ExampleOfExceptionHandlind;

public class ExampleofFinallyKeyword {
	
	public static void main(String args[])
	{
		try
		{
			int data=30/5;
			System.out.println("Print value of  "+data);
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Finally Keyword is print");
		}
		System.out.println("Rehan Raza Here");
	}

}
