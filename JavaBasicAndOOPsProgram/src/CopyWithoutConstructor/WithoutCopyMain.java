package CopyWithoutConstructor;

public class WithoutCopyMain {
	public static void main(String args[])
	{
		ExampleOfWithoutConstructor w = new ExampleOfWithoutConstructor(12,"Amit Kumar");
		ExampleOfWithoutConstructor w1 = new ExampleOfWithoutConstructor(13,"Rehan Raza");
		ExampleOfWithoutConstructor w2 = new ExampleOfWithoutConstructor();
		ExampleOfWithoutConstructor w3 = new ExampleOfWithoutConstructor();
		w2.id=w.id;
		w2.name=w.name;
		
		w3.id=w1.id;
		w3.name=w1.name;
		
		w.display();
		w1.display();
		
		w2.display();
		w3.display();
	}

}
