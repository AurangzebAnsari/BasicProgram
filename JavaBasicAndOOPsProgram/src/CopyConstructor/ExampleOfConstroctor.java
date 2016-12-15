package CopyConstructor;

public class ExampleOfConstroctor {
	int rollno;
	String name;
	public ExampleOfConstroctor(int i,String n) {
		rollno=i;
		name=n;
	}
	public ExampleOfConstroctor(ExampleOfConstroctor s) {
		rollno=s.rollno;
		name=s.name;
	}
	void display()
	{
		System.out.println("Roll No "+rollno+"\nName  "+name);
	}

}
