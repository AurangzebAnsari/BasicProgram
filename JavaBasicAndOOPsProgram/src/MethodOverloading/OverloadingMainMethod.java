package MethodOverloading;

public class OverloadingMainMethod {
	public static void main(int a,int b)
	{
		System.out.println("Sum of A and B="+(a+b));
	}
	public static void main(String name,String gender)
	{
		System.out.println("Name  "+name+"\nGender  "+gender);
	}
	
	public static void main(String arfs[])
	{
		//OverloadingMainMethod over=new OverloadingMainMethod();
		main(78, 89);
		main("Rehan Raza", "Male");
		
	}

}
