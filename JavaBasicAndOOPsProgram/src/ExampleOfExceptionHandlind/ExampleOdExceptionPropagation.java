package ExampleOfExceptionHandlind;

public class ExampleOdExceptionPropagation {
	void m()
	{
		int a=50/0;
		System.out.println(a);
	}
	void n()
	{
		m();
		System.out.println("N() Method is called");
	}
	void o()
	{
		n();
		System.out.println("O method is called");
	}
	void p()
	{
	   o();
	   System.out.println("P method is called");
	}
	void q()
	{
		try{
		p();
		System.out.print("Q method is called");
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception Is Here");
		}
	}
	      public static void main(String args[])
	      {
	    	  ExampleOdExceptionPropagation p=new ExampleOdExceptionPropagation();
	    	  p.q();
	    	  System.out.println("This is main Method");
	      }

}
