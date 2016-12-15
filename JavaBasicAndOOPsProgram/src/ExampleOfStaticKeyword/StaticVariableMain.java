package ExampleOfStaticKeyword;

public class StaticVariableMain {
	public static void main(String args[])
	{
	ExapleOfStaticvariable ep=new ExapleOfStaticvariable("Ram kumar", 12);
	ExapleOfStaticvariable ep1=new ExapleOfStaticvariable("Amit Kumar", 13);
	ExapleOfStaticvariable ep2=new ExapleOfStaticvariable("Shyam Kumar", 14);
	ExapleOfStaticvariable ep3=new ExapleOfStaticvariable("Rohan Kumar", 15);
	
	ep.display();
	ep.result(54, 75, 74, 92, 65);
	
	ep1.display();
	ep1.result(78, 73, 74, 78, 87);
	
	ep2.display();
	ep2.result(54, 55, 45, 63, 78);
	
	ep3.display();
	ep3.result(54, 45, 34, 35, 46);
	}
}
