package ExampleOfExceptionHandlind;

public class FinallyKeyword2 {
	public static void main(String args[])
	{
		try
		{
			int a=25/0;
			System.out.println(a);
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
		}
		finally{
			System.out.println("Finally Keyword is Always run");
		}
		System.out.println("Rehan Raza here");
	}

}
