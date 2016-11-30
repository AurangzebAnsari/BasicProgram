package ExampleOfExceptionHandlind;

public class MultipleCatchInoneProgram {
	public static void main(String args[])
	{
		try{
			int a[]=new int[5];
			a[5]=3/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println("ArithmaticException is run");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException is run");
		}
		catch(Exception e)
		{
			System.out.println("Common task Completed");
		}
	}

}
