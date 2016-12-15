package ExampleOfExceptionHandlind;

public class multipleCatchExample {
	public static void main(String args)
	{
		try
		{
			int a[]=new int[20];
			a[5]=30/0;
		}
		catch(Exception e)
		{
			System.out.println("Common Task is Completed");
		}
		catch(ArithmeticException e)
		{
			System.out.println("ArithmaticException1 is run");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException2 is run");
		}
		System.out.println("Rest of the code....");
	}

}
