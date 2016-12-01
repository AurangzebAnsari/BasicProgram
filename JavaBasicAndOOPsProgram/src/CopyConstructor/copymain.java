package CopyConstructor;

public class copymain {
	public static void main(String argd[])
	{
		ExampleOfConstroctor e= new ExampleOfConstroctor(12,"Rehan Raza");
		ExampleOfConstroctor e1= new ExampleOfConstroctor(13,"Amit Kumar");
		ExampleOfConstroctor e2= new ExampleOfConstroctor(e);
		e.display();
		e1.display();
		e2.display();
	}

}
