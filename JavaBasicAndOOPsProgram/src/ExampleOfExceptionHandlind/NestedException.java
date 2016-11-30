package ExampleOfExceptionHandlind;

public class NestedException {
	public static void main(String args[])
	{
		try{
			try{
				System.out.println("Divid this number");
				
				int a=40/0;
			}
			catch(ArithmeticException e)
			{
				System.out.println(e);
			}
		try
		{
			int data[]=new int[5];
			data[5]=4;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		System.out.println("Handle to Exception");
		}
		catch(Exception e)
		{
			System.out.println("Handle default Exception");
		}
		System.out.println("Normal flows");
		
	}
		
	}

