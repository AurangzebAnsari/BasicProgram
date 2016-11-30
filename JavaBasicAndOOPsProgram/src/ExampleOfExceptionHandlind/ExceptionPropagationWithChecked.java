package ExampleOfExceptionHandlind;

import java.io.IOException;

public class ExceptionPropagationWithChecked {
	void m()
	{
		throw new java.io.IOException("device error");
	}
	 void n()
	 {
		 m();
		 System.out.println("This is N mathod");
	 }
	 void o()
	 {
		 n();
		 System.out.println("This is O method");
	 }
	 void p()
	 {
		 try
		 {
			 o();
			 System.out.println("This is P method");
		 }
		 catch(Exception e)
		 {
			 System.out.println(e);
		 }
	 }
	 public static void main(String args[])
	 {
		 ExceptionPropagationWithChecked exception=new ExceptionPropagationWithChecked();
		 exception.p();
		 System.out.println("This is main Method");
	 }

}
